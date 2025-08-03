package advancedDev;

import java.io.IOException;
import java.net.URI;
import java.net.ProxySelector;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Version;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;

public class HTTPClient
{
    static ExecutorService executor = Executors.newFixedThreadPool(7, new ThreadFactory()
    {
        @Override
        public Thread newThread(Runnable runnable)
        {
            Thread thread = new Thread(runnable);
            System.out.printf("Created new Thread %s. Thread group is %s.%n", thread.isDaemon() ?  "daemon" : "", thread.getThreadGroup());
            return thread;
        }
    });

    public static void main(String[] args) throws Exception
    {
        connectHTTP11Client();
        connectHTTP2Client();
        connectAndPrintURLJavaOracle();
    }

    /**
     * HARDCODE TO AKAMAI
     * @param path
     * @throws Exception
     */
    private static void connectHTTP11Client() throws Exception
    {
        final String path = "https://http2.akamai.com/demo/h2_demo_frame.html";
        System.out.printf("Running HTTP/1.1");
        try
        {
            HttpClient httpClient = HttpClient.newBuilder()
                                              .version(Version.HTTP_1_1)
                                              .proxy(ProxySelector.getDefault())
                                              .build();

            long start = System.currentTimeMillis();

            HttpRequest mainRequest = HttpRequest.newBuilder()
                                                 .uri(URI.create(path))
                                                 .build();

            HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.printf("STATUS : %d %n", response.statusCode());
            System.out.printf("HEADER : %s %n", response.headers());
            String responseBody = response.body();
            System.out.printf("BODY : %s %n", responseBody);

            List<Future<?>> future = new ArrayList<>();

            // STARTSWITH HARDCODED TO AKAMAI
            responseBody.lines()
                        .filter(line -> line.trim().startsWith("<img height"))
                        .map(line -> line.substring(line.indexOf("src='") + 5, line.indexOf("'/>")))
                        .forEach(image -> {
                            Future<?> imgFuture = executor.submit(() -> {
                                HttpRequest imgRequest = HttpRequest.newBuilder()
                                                                    .uri(URI.create(String.format("%s %s", path.subSequence(path.indexOf("https"), path.indexOf(".com")), image)))
                                                                    .build();
                                try
                                {
                                    HttpResponse<String> imageResponse = httpClient.send(imgRequest, HttpResponse.BodyHandlers.ofString());
                                    System.out.printf("LOADED : %s %n STATUS : %d %n", image, imageResponse.statusCode());
                                } catch (IOException | InterruptedException exception) {
                                    System.out.printf("EXCEPTION : %s %n", exception);
                                }
                            });
                            future.add(imgFuture);
                            System.out.printf("%s %n", image);
                        });

            future.forEach(var -> {
                try
                {
                    var.get();
                } catch (InterruptedException | ExecutionException exception) {
                    System.out.printf("ERROR TO LOAD %n");
                }
            });

            long end = System.currentTimeMillis();
            System.out.printf("%d ms%n", end - start);
        } finally {
            executor.shutdown();
        }
    }
    
    private static void connectHTTP2Client() throws Exception
    {
        final String path = "https://http2.akamai.com/demo/h2_demo_frame.html";
        System.out.printf("Running HTTP/2");
        try
        {
            HttpClient httpClient = HttpClient.newBuilder()
                                              .version(Version.HTTP_2)
                                              .proxy(ProxySelector.getDefault())
                                              .build();

            long start = System.currentTimeMillis();

            HttpRequest mainRequest = HttpRequest.newBuilder()
                                                 .uri(URI.create(path))
                                                 .build();

            HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.printf("STATUS : %d %n", response.statusCode());
            System.out.printf("HEADER : %s %n", response.headers());
            String responseBody = response.body();
            System.out.printf("BODY : %s %n", responseBody);

            List<Future<?>> future = new ArrayList<>();

            // STARTSWITH HARDCODED TO AKAMAI
            responseBody.lines()
                        .filter(line -> line.trim().startsWith("<img height"))
                        .map(line -> line.substring(line.indexOf("src='") + 5, line.indexOf("'/>")))
                        .forEach(image -> {
                            Future<?> imgFuture = executor.submit(() -> {
                                HttpRequest imgRequest = HttpRequest.newBuilder()
                                                                    .uri(URI.create(String.format("%s %s", path.subSequence(path.indexOf("https"), path.indexOf(".com")), image)))
                                                                    .build();
                                try
                                {
                                    HttpResponse<String> imageResponse = httpClient.send(imgRequest, HttpResponse.BodyHandlers.ofString());
                                    System.out.printf("LOADED : %s %n STATUS : %d %n", image, imageResponse.statusCode());
                                } catch (IOException | InterruptedException exception) {
                                    System.out.printf("EXCEPTION : %s %n", exception);
                                }
                            });
                            future.add(imgFuture);
                            System.out.printf("%s %n", image);
                        });

            future.forEach(var -> {
                try
                {
                    var.get();
                } catch (InterruptedException | ExecutionException exception) {
                    System.out.printf("ERROR TO LOAD %n");
                }
            });

            long end = System.currentTimeMillis();
            System.out.printf("%d ms%n", end - start);
        } finally {
            executor.shutdown();
        }
    }

    private static void connectAndPrintURLJavaOracle() throws IOException, InterruptedException
    {
        String path = "https://docs.oracle.com/javase/10/language/";
        HttpRequest request = HttpRequest.newBuilder()
                                         .GET()
                                         .uri(URI.create(path))
                                         .build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.printf("STATUS : %d %n", response.statusCode());
        System.out.printf("HEADER : %s %n", response.headers());
        System.out.printf("BODY : %s %n", response.body());
    }
}