package collections.optionals;

// import java.util.OptionalDouble;
// import java.util.OptionalLong;
// import java.util.OptionalInt;
// import java.util.Optional;
import java.util.*;

public class ExampleOptionals
{
    public static void main (String[] args)
    {
        Optional<String> optionalName = Optional.of("value");
        Optional<String> optionalNull = Optional.ofNullable("value");
        Optional<String> optionalEmpty = Optional.empty();

        System.out.println(optionalName.isPresent());
        System.out.printf("optionalName is present? %b%n", optionalName.isPresent());
        System.out.printf("optionalNull is present? %b%n", optionalNull.isPresent());
        System.out.printf("optionalEmpty is present? %b%n", optionalEmpty.isPresent());
        System.out.printf("optionalName is empty? %b%n", optionalName.isEmpty());
        System.out.printf("optionalNull is empty? %b%n", optionalNull.isEmpty());
        System.out.printf("optionalEmpty is empty: %b%n", optionalEmpty.isEmpty());

        optionalName.ifPresent(System.out::println);
        optionalName.ifPresentOrElse(System.out::println, () -> System.out.printf("%f%n", Math.random()));

        optionalName.map((valor) -> valor.concat("concatenation")).ifPresent(System.out::println);

        System.out.println(optionalName.orElseThrow(IllegalStateException::new));
    }
}

class ExemploOptionalEstates
{
    public static void main(String[] args)
    {
        Optional<String> optionalString = Optional.of("Present value");
        System.out.println("Present optional value");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Not present"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Not present optional value");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = not present"));

        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Not present optional value");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = not present"));

        Optional<String> optionalNullError = Optional.of(null);
        System.out.println("Option value which send exeption: NullPointerException");
        optionalNullError.ifPresentOrElse(System.out::println, () -> System.out.println("error = not present"));
    }
}

class ExemploOtionalPrimitives
{
    public static void main(String[] args)
    {
        System.out.println("***Optional integer value***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("***Optional decimal value***");
        OptionalDouble.of(55.0).ifPresent(System.out::println);

        System.out.println("***Optional Long value***");
        OptionalLong.of(23L).ifPresent(System.out::println);
    }
}