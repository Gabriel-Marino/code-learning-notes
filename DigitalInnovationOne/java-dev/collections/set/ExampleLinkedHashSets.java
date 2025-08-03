package collections.set;

// import java.util.TreeSet;
// import java.util.HashSet;
// import java.util.LinkedHashSet;
import java.util.*;

//  When: it's necessary to keep the order of insertion;
//  Sort: keep order of insertion;
//  Performance: worst performance
public class ExampleLinkedHashSets
{
    public static void main(String[] args)
    {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(55);
        linkedHashSet.add(34);
        linkedHashSet.add(21);
        linkedHashSet.add(13);
        linkedHashSet.add(8);
        linkedHashSet.add(05);
        linkedHashSet.add(03);
        linkedHashSet.add(02);
        linkedHashSet.add(01);
        linkedHashSet.add(01);

        linkedHashSet.remove(8);

        while(linkedHashSet.iterator().hasNext())
        {
            System.out.printf("%d%n", linkedHashSet.iterator().next());
            System.out.printf("%d%n", linkedHashSet.size());
            linkedHashSet.remove(linkedHashSet.iterator().next());
        }
    }
}