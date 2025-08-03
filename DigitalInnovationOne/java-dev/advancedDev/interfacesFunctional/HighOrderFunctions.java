package advancedDev.interfacesFunctional;

/**
 * High Order Functions are functions which receive others functions as paramater or return others function.
 */
public class HighOrderFunctions
{
    public static void main(String[] args)
    {
        Operation sum = (value1, value2) -> value1 + value2,
                  sub = (value1, value2) -> value1 - value2,
                  prod = (value1, value2) -> value1 * value2,
                  div = (value1, value2) -> value1 / value2,
                  pow = (value1, value2) -> Math.pow(value1, value2),
                  nthroot = (value1, value2) -> Math.pow(value1, 1/value2);

        double value1 = 9, value2 = 2;
        System.out.printf("The result is %f.%n", execute(sum, value1, value2));
        System.out.printf("The result is %f.%n", execute(sub, value1, value2));
        System.out.printf("The result is %f.%n", execute(prod, value1, value2));
        System.out.printf("The result is %f.%n", execute(div, value1, value2));
        System.out.printf("The result is %f.%n", execute(pow, value1, value2));
        System.out.printf("The result is %f.%n", execute(nthroot, value1, value2));
    }

    public static Double execute (Operation operator, Double value1, Double value2)
    {
        return operator.Do(value1, value2);
    }
}

@FunctionalInterface
interface Operation
{
    public Double Do (Double value1, Double value2);
}