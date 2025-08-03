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

/**
 * A application to organize what domestic hores are peding. For now is all hard coded, i just preoduced what was given to me as example.
 * In the future will receive the name of the room and what chore to do as parameters.
 * 
 * @param String roomName
 * @param String chore
 * 
 * @return
 * 
 * @throws InterruptedException
 * @throws ExecutionException
 */
public class Chores
{
    private static final ExecutorService Exec = Executors.newFixedThreadPool(13);
    public static void main(String[] args) throws InterruptedException, ExecutionException
    {
        Room[] rooms = {
            new Room("Kitchen"),
            new Room("Bedroom"),
            new Room("Dining room"),
            new Room("livining room")
        };
        Home house = new Home(rooms);

        List<Future<String>> futures = new CopyOnWriteArrayList<>(
            house.chores().stream()
                        .map(
                            chore -> Exec.submit(
                                () -> {
                                    try
                                    {
                                        return chore.Do();
                                    } catch (InterruptedException exception) {
                                        exception.printStackTrace();
                                    }
                                    return null;
                                }
                            )
                        )
                        .collect(Collectors.toList())
        );

        while (true)
        {
            int choresToDo = 0;
            for (Future<?> future : futures)
            {
                if (future.isDone())
                {
                    try
                    {
                        System.out.printf("You finished: %s.%n", future.get());
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    } catch (ExecutionException exception) {
                        exception.printStackTrace();
                    }
                } else {
                    choresToDo++;
                }
            }
            if (futures.stream().allMatch(Future::isDone)) break;
            System.out.printf("You have %d chores to do.%n", choresToDo);
        }

        Exec.shutdown();
    }
}

class Home
{
    private List<room> rooms;

    Home(room... rooms)
    {
        this.rooms = Arrays.asList(rooms);
    }

    List<chore> chores()
    {
        return this.rooms.stream().map(room::toDo)
                         .reduce(
                            new ArrayList<chore>(), (list, chore) -> {
                                list.addAll(chore);
                                return list;
                            }
                         );
    }
}

interface chore
{
    String Do() throws InterruptedException;
}

abstract class room
{
    abstract List<chore> toDo();
}

class Room extends room
{
    final private String roomName;

    public Room(String name)
    {
        this.roomName = name;
    }

    @Override
    List<chore> toDo()
    {
        return Arrays.asList(
            this::cleanRoom,
            this::organizeRoom
        );
    }

    private String cleanRoom() throws InterruptedException
    {
        String comment = String.format("Cleaning room: %s.", this.roomName);
        printS(comment);
        return comment;
    }

    private String organizeRoom() throws InterruptedException
    {
        String comment = String.format("Organizing room: %s.", this.roomName);
        printS(comment);
        return comment;
    }

    private void printS(String string)
    {
        System.out.printf("%s%n", string);
    }
}