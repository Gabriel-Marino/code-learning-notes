package collections.map;

// import java.util.Hashtable;
// import java.util.Iterator;
// import java.util.Map;
import java.util.*;

public class ExempleHashTable
{
    public static void main(String[] args)
    {
        Hashtable<String, String> tableName = new Hashtable<>();
        for (int index = 0; index < 24; index++)
        {
            tableName.put(String.format("%f", (index+1)*Math.random()), String.format("%f", Math.random()*Math.random()));
        }

        // tableName.firstKey();
        // tableName.lastKey();
        // tableName.lowerKey("arg");
        // tableName.higherKey("arg");
        // tableName.firstEntry().getKey();
        // tableName.firstEntry().getValue();
        // tableName.lastEntry().getKey();
        // tableName.lastEntry().getValue();
        // tableName.lowerEntry("arg").getKey();
        // tableName.lowerEntry("arg").getValue();
        // tableName.HigherEntry("arg").getKey();
        // tableName.HigherEntry("arg").getValue();
        // tableName.pollFirstEntry().getKey();
        // tableName.pollFirstEntry().getValue();
        // tableName.pollLastEntry().getKey();
        // tableName.pollLastEntry().getValue();

        for (Map.Entry<String, String> entry : tableName.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        for (String key : tableName.keySet()) {
            System.out.println(key + " -- " + tableName.get(key));
        }
    }
}