package collections.queue;

// import java.util.LinkedList;
// import java.util.Iterator;
// import java.util.Queue;
import java.util.*;

public class ExampleLinkedLists
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<>();

        for(int index = 0; index < 10; index++)
        {
            queue.add(String.format("pos%d", index));
        }

        int queueSize = queue.size();

        System.out.println(queue);
        System.out.printf("%d%n", queueSize);

        String next = queue.poll();     //  Return the first element in the queue and remove the element;
        System.out.printf("Next in the queue is %s.%n", next);

        String first = queue.peek();    // Return the first element and don't modify the queue; if the queue is empty peek return null, element emthod return a exception;
        System.out.printf("The first is %s.%n", first);

        System.out.println(queue);

        // Iterate only for the elements in the queue;
        for (String inPos: queue)
        {
            System.out.printf("%s%n", inPos);
        }

        // Iterartes forever
        // while (queue.iterator().hasNext())
        // {
        //     System.out.printf("%s%n", queue.iterator().next());
        // }
    }
}