package advancedDev.interfacesFunctional;

import java.util.function.Consumer;

public class Consumers
{
    public static void main(String[] args)
    {
        Consumer<String> Print = System.out::print;
        Consumer<String> PrintN = word -> System.out.print(word);

        Print.accept("Hello World!\n");
        PrintN.accept("Hello World!\n");
    }
}