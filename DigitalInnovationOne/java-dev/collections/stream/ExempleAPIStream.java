package collections.stream;

// import java.util.stream.Collectors;
// import java.util.Comparator;
// import java.util.ArrayList;
// import java.util.List;
import java.util.stream.*;
import java.util.*;

public class ExempleAPIStream
{
    public static void main(String[] args)
    {
        int indexMax = 100;
        List<String> streamName = new ArrayList<>();
        for (int index = 1; index <= indexMax; index++)
        {
            String str = "";
            for (int jndex = 1; jndex <= 10*index*Math.random(); jndex++)
            {
                str += Math.random() >= Math.random()? "a" : "A";
            }
            streamName.add(str);
        }

        System.out.printf("Count: %d%n", streamName.stream().count());
        System.out.printf("Bigger: %s%n", streamName.stream().max(Comparator.comparingInt(String::length)));
        System.out.printf("Lesser: %s%n", streamName.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("With 'aAaaAa': " + streamName.stream()
                                                     .filter((value) -> value.contains("aAaaAa"))
                                                     .collect(Collectors.toList())
        );

        System.out.println("New collection with letter couting: " + streamName.stream()
                                                                              .map(value -> value.concat(" - ").concat(String.valueOf(value.length())))
                                                                              .collect(Collectors.toList())
        );

        System.out.println("All match with 'b'" + streamName.stream().allMatch((value) -> value.contains("b")));
        System.out.println("Any match with 'b'" + streamName.stream().anyMatch((value) -> value.contains("b")));
        System.out.println("None match with 'b'" + streamName.stream().noneMatch((value) -> value.contains("b")));

        System.out.printf("First value: ");
        streamName.stream().findFirst().ifPresent(System.out::println);

        System.out.printf("Chain operations: ");
        System.out.println(streamName.stream()
                                     .peek(System.out::println)
                                     .map(value -> value.concat(" - ").concat(String.valueOf(value.length())))
                                     .peek(System.out::println)
                                     .filter(value -> value.contains("aAaAaAaAaAaAa"))
                                     .collect(Collectors.toList())
        );
    }
}