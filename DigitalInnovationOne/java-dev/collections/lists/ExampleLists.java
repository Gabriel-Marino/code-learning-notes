package collections.lists;

// import java.util.Collections;
// import java.util.ArrayList;
// import java.util.List;
import java.util.*;

public class ExampleLists
{
    static List<String> argv = new ArrayList<>();

    public static int main(String[] args)
    {
        if (args.length > 0)
        {
            for (String arg: args)
            {
                argv.add(arg);
            }
            Collections.sort(argv);
        }

        argv.remove(0);
        argv.remove("0");

        String name = argv.get(argv.indexOf("name"));
        String printNAME = name.isEmpty() ? "There is no name!%n" : String.format("The name is %s%n", name);
        System.out.printf(printNAME);

        int argc = argv.size();
        String printARGC = argc == 0 ? "There is no arguments!%n" : String.format("There is %d arguments.%n", argc);
        System.out.printf(printARGC);

        if (!argv.isEmpty())
        {
            while(argv.iterator().hasNext())
            {
                System.out.printf("%s%n", argv.iterator().next());
            }
        }

        argv.clear();
        return 0;
    }
}