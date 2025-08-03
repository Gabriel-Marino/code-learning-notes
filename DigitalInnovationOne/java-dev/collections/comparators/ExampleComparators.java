package collections.comparators;

// import java.util.Collections;
// import java.util.Comparator;
// import java.util.ArrayList;
import java.util.*;

public class ExampleComparators
{
    public static void main (String[] args)
    {
        List<CompClass> listName = new ArrayList<>();

        int maxIndex = 10;
        for (int index = 0; index < maxIndex; index++)
        {
            listName.add(new CompClass(String.format("name %d", index+1), (int)Math.floor(10*(index+1)*Math.random())));
        }

        System.out.printf("<-- Insertion order --> ");
        System.out.println(listName);

        listName.sort((first, second) -> first.getNum() - second.getNum());
        System.out.printf("<-- Crescent number order --> ");
        System.out.println(listName);

        listName.sort((first, second) -> second.getNum() - first.getNum());
        System.out.printf("<-- Decrescent number order --> ");
        System.out.println(listName);

        listName.sort(Comparator.comparingInt(CompClass::getNum));
        System.out.printf("<-- Crescent number order (method reference) --> ");
        System.out.println(listName);

        listName.sort(Comparator.comparingInt(CompClass::getNum).reversed());
        System.out.printf("<-- Decrescent number order (method reference) --> ");
        System.out.println(listName);

        Collections.sort(listName, new ClassOrderCompClass());
        System.out.printf("<-- Crescent number order (interface comparator) --> ");
        System.out.println(listName);

        Collections.sort(listName, new ClassOrderCompClassReverse());
        System.out.printf("<-- Decrescent number order (interface comparator) --> ");
        System.out.println(listName);
    }
}

class CompClass implements Comparable<CompClass>
{
    private final String name;
    private final Integer num;

    public CompClass (String name, Integer num)
    {
        this.name = name;
        this.num = num;
    }

    public String getName ()
    {
        return this.name;
    }

    public Integer getNum ()
    {
        return this.num;
    }

    @Override
    public String toString()
    {
        return name + " : " + num;
    }

    @Override
    public int compareTo(CompClass obj)
    {
        return this.num - obj.num;
    }
}

class ClassOrderCompClass implements Comparator<CompClass>
{
    @Override
    public int compare(CompClass o1, CompClass o2)
    {
        return o1.getNum() - o2.getNum();
    }
}

class ClassOrderCompClassReverse implements Comparator<CompClass>
{
    @Override
    public int compare(CompClass o1, CompClass o2)
    {
        return o2.getNum() - o1.getNum();
    }
}