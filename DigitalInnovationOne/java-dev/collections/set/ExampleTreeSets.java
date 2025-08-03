package collections.set;

// import java.util.TreeSet;
// import java.util.HashSet;
// import java.util.LinkedHashSet;
import java.util.*;

//  When: it's wanted to sort by comparators;
//  Sort: keep order of insertion and can be sorted;
//  Performance: good for read, to modifications can be worse than the LinkedHashSet
public class ExampleTreeSets
{
    public static void main(String[] args)
    {
        Set<Integer> treeSet = new TreeSet<>();

        // treeSet.first();
        // treeSet.last();
        // treeSet.pollFirst();
        // treeSet.pollLast();
        // treeSet.lower("arg");
        // treeSet.higher("arg");

        System.out.printf("%b%n", treeSet.isEmpty());
    }
}