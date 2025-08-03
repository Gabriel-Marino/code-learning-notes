package advancedDev.paradigmFunctional;

/**
 * Lambdas are a concept which obey functional paradigm concept, they're used to improve the code readability and improve productivity when working whits objects.
 */
public class Lambdas
{
    public static void main(String[] args)
    {
        String number = args[0];
        withLambda(number);
        withOutLambda(number);
    }

    public static void withLambda(String num)
    {
        //  Only one instruction
        Lambda number = value -> Integer.parseInt(value);

        Lambda doubleNum = value -> {
            int converted = Integer.parseInt(value);
            int doubled = 2 * converted;
            return doubled;
        };

        Lambda printNum = value -> {
            int converted = Integer.parseInt(value);
            System.out.printf("%d %n", converted);
            return 0;
        };

        printNum.createNum(num);
        System.out.printf("%d %d %n", number.createNum(num), doubleNum.createNum(num));
    }

    public static void withOutLambda(String num)
    {
        AnomClass number = new AnomClass()
        {
            @Override
            public Integer createNum(String num)
            {
                return Integer.parseInt(num);
            }
        };

        System.out.printf("%d%n", number.createNum(num));
    }
}

/**
 * InnerLambdas.
 * Functional interfaces have only one abstract method.
 * When a lambda have only one instruction is not need to use curly brackets, but when is more than one instruction is mandatory.
 */
@FunctionalInterface
interface Lambda
{
    Integer createNum(String num);
}

/**
 * Before lambdas are needed to declare an anonymous abstract class
 */
abstract class AnomClass
{
    public abstract Integer createNum(String num);
}