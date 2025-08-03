package advancedDev.paradigmFunctional;

import java.util.function.UnaryOperator;

public class Paradigm
{
    public static void main (String[] args)
    {
        // main
    }
}

/**
 * The imperative paradigm is like write a script, how the program should work step by step.
 */
class Imperative
{
    public static void main (String[] args)
    {
        double value1 = Double.parseDouble(args[1]);
        double value2 = Double.parseDouble(args[2]);
        double result = value1 * value2;

        System.out.printf("The product of %f by %f is %f.%n", value1, value2, result);
    }
}

/**
 * The functional paradigm is inspired by the lambda calculus. So instead writing a script, is wrote rules to what the program should do.
 */
class Functional
{
    public static void main (String[] args)
    {
        UnaryOperator<Double> squared = value -> value*value;
        double value = Double.parseDouble(args[1]);

        System.out.printf("The square of %f is %f.%n", value, squared.apply(value));
    }
}