package collections.map;

// import java.util.HashMap;
// import java.util.Map;
import java.util.*;

public class ExempleHashMap
{
    public static void main(String[] args)
    {
        Map<String, Double> map = new HashMap<>();
        int indexMax = 10;
        for (int index = 0; index < indexMax; index++)
        {
            map.put(String.format("pos%d", index), Math.random());
        }

        // map.get("arg");
        // map.containsKey("arg");
        // map.containsValue("arg");
        // map.remove("arg");
        // map.size();
        // map.clear();

        for (Map.Entry<String, Double> entry: map.entrySet())
        {
            System.out.printf("%s %f%n", entry.getKey(), entry.getValue());
        }

    }
}