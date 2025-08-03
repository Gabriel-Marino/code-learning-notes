package collections.map;

// import java.util.Iterator;
// import java.util.TreeMap;
// import java.util.Map;
import java.util.*;

public class ExempleTreeMap
{
    public static void main(String[] args)
    {
        TreeMap<String, String> treeName = new TreeMap<>();
        for (int index = 0; index < 24; index++)
        {
            treeName.put(String.format("%f", (index+1)*Math.random()), String.format("%f", Math.random()*Math.random()));
        }

        // treeName.firstKey();
        // treeName.lastKey();
        // treeName.lowerKey("arg");
        // treeName.higherKey("arg");
        // treeName.firstEntry().getKey();
        // treeName.firstEntry().getValue();
        // treeName.lastEntry().getKey();
        // treeName.lastEntry().getValue();
        // treeName.lowerEntry("arg").getKey();
        // treeName.lowerEntry("arg").getValue();
        // treeName.HigherEntry("arg").getKey();
        // treeName.HigherEntry("arg").getValue();
        // treeName.pollFirstEntry().getKey();
        // treeName.pollFirstEntry().getValue();
        // treeName.pollLastEntry().getKey();
        // treeName.pollLastEntry().getValue();

        while (treeName.keySet().iterator().hasNext())
        {
            String key = treeName.keySet().iterator().next();
            System.out.println(key + " - " + treeName.get(key));
        }

        for (String entry: treeName.keySet())
        {
            System.out.println(entry + " -- " + treeName.get(entry));
        }

        for (Map.Entry<String, String> entry: treeName.entrySet())
        {
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }
    }
}