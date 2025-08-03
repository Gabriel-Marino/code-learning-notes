package advancedDev.paradigmFunctional;

public class Factorial
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(args[0]);
        System.out.printf("The factorial of %d is %d.%n", num, recursive(num));
    }

    static Integer recursive(Integer number)
    {
        if (number < 0)
        {
            System.out.printf("Is not possible to calculate the factorial of negative numbers, to this see Gamma Function.");
            return null;
        }

        if (number > 1) return number * recursive(number - 1);

        return 1;
    }

    static Integer fat(Integer number)
    {
        if (number < 0)
        {
            System.out.printf("Is not possible to calculate the factorial of negative numbers, to this see Gamma Function.");
            return null;
        }

        int index, fat = 1;

        for (index = number; index > 0; index--)
        {
            fat *= index;
        }

        return fat;
    }

    // static Integer tailCall(Integer pos, Integer number)
    // {
    //     if (number < 0)
    //     {
    //         System.out.printf("Is not possible to calculate the factorial of negative numbers, to this see Gamma Function.");
    //         return null;
    //     }

    //     if (pos == 0) return number;

    //     return tailCall(pos - 1, number * pos);
    // }
}