package advancedDev.paradigmFunctional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionsComposition
{
    public static void main(String[] args)
    {
        List<Double> values =  new ArrayList<>();
        values = Arrays.stream(args).map(value -> Double.parseDouble(value)).collect(Collectors.toList());

        values.stream()
              .filter(value -> value % 2 == 0)
              .map(value -> value * value)
              .forEach(value -> System.out.printf("%f%n", value));
    }
}

/**
 * It's important to functional programming the concepts of pure functions and immutability.
 */