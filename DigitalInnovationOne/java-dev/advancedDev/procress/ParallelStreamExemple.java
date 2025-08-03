package advancedDev.procress;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class ParallelStreamExemple
{
    public static void main(String[] args)
    {
        long beg, end;

        beg = System.currentTimeMillis();
        IntStream.range(0, 100).forEach(num -> factorial(num));
        end = System.currentTimeMillis();
        System.out.printf("serial execution time: %dms.%n", end - beg);

        beg = System.currentTimeMillis();
        IntStream.range(0, 100).parallel().forEach(num -> factorial(num));
        end = System.currentTimeMillis();
        System.out.printf("parallel execution time: %dms.%n", end - beg);
    }

    public static long factorial(Integer number)
    {
        int index = number;
        // Long fat = (long)1;
        BigInteger fat = new BigInteger("1");

        if (number > 1)
        {
            while (index > 1)
            {
                fat = fat.multiply(new BigInteger(String.format("%d", index)));
                index--;
            }
        }
        return Math.abs(fat.longValue());
    }
}