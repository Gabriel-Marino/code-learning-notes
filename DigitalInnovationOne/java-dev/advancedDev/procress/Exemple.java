package advancedDev.procress;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CopyOnWriteArrayList;

public class Exemple
{
    private static final ExecutorService Exec = Executors.newFixedThreadPool(7);
    public static void main(String[] args) throws InterruptedException, ExecutionException
    {
        Struct toDo = new Struct(new Place());

        List<Future<String>> futures = new CopyOnWriteArrayList<>(
            toDo.Actions().stream().map(act -> Exec.submit(
                () -> {
                        try
                        {
                            return act.Do();
                        } catch (InterruptedException exception) {
                            exception.printStackTrace();
                        }
                            return null;
                    }
                )
            ).collect(Collectors.toList())
        );

        while (true)
        {
            int num = 0;
            for(Future<?> future: futures)
            {
                if (future.isDone())
                {
                    try
                    {
                        System.out.printf("Finished: %s.%n", future.get().toString());
                        futures.remove(future);
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    } catch (ExecutionException exception) {
                        exception.printStackTrace();
                    }
                } else {
                    num++;
                }
            }

            if (futures.stream().allMatch(Future::isDone)) break;

            System.out.printf("Number:: %d%n", num);
            Thread.sleep(420);
        }
        Exec.shutdown();
    }
}

class Struct
{
    private List<Anom> Thing;

    Struct(Anom... Thing)
    {
        this.Thing = Arrays.asList(Thing);
    }

    List<Action> Actions()
    {
        return this.Thing.stream().map(Anom::obtainActions)
                        .reduce(new ArrayList<Action>(), (var1, var2) -> {
                            var1.addAll(var2);
                            return var1;
                        });
    }
}

interface Action
{
    String Do() throws InterruptedException;
}

abstract class Anom
{
    abstract List<Action> obtainActions();
}

class Place extends Anom
{
    @Override
    List<Action> obtainActions()
    {
        return Arrays.asList(
            this::action1,
            this::action2,
            this::action3
        );
    }

    private String action1() throws InterruptedException
    {
        Thread.sleep(6969);
        String comment = "Doing action 1";
        System.out.printf("%s %n", comment);
        return comment;
    }

    private String action2() throws InterruptedException
    {
        Thread.sleep(420);
        String comment = "Doing action 2";
        System.out.printf("%s %n", comment);
        return comment;
    }

    private String action3() throws InterruptedException
    {
        Thread.sleep(42069);
        String comment = "Doing action 3";
        System.out.printf("%s %n", comment);
        return comment;
    }
}