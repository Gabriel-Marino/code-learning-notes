package advancedDev.interfacesFunctional;

import java.util.function.Function;

public class Funcs
{
    public static void main(String[] args)
    {
        Function<String, Integer> StringSize = string -> string.length();
        Function<String, String> Reverter = string -> new StringBuilder(string).reverse().toString();

        String word = "Hello World!";
        System.out.printf("%d%n", StringSize.apply(word));
        System.out.printf("%s%n", Reverter.apply(word));
        System.out.printf("%d%n", StringSize.apply(word));
    }
}