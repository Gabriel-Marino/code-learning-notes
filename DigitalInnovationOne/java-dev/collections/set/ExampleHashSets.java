package collections.set;

// import java.util.TreeSet;
// import java.util.HashSet;
// import java.util.LinkedHashSet;
import java.util.*;

//  When: not necessary keep a order;
//  Sort: not sorted, don't allow duplicate values;
//  Performance: best performance
public class ExampleHashSets
{
    public static void main(String[] args)
    {
        int total = 1000;
        Set<Double> hashSet = new HashSet<>();
        for (int index = 1; index <= total; index++)
        {
            hashSet.add(10*Math.random());
        }

        double mean = hashSet.stream().mapToDouble(Double::doubleValue).sum()/total;
        System.out.printf("%f%n", mean);

        System.out.printf("%d%n", hashSet.size());
        for (Double num: hashSet)
        {
            if (num < mean)
            {
                hashSet.remove(num);
            }
        }
        System.out.printf("%d%n", hashSet.size());

        // while(hashSet.iterator().hasNext())
        // {
        // !   infinite loop while hashSet is not empty
        // }
    }
}