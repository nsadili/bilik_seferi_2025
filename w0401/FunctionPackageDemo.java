package w0401;

import java.util.Optional;
import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionPackageDemo {
    public static void main(String[] args) {

        Predicate<String> isValidUsername = str -> str != null && str.trim().length() > 5;

        BiPredicate<Integer, Integer> isFirstGreater = (a, b) -> a > b;
        System.out.println(isFirstGreater.test(3, 5));
        System.out.println(isFirstGreater.test(5, 3));

        // System.out.println(isValidUsername.negate().test(null));

        Function<Integer, Optional<Long>> fact = num -> {
            if (num < 0)
                return Optional.empty();

            long f = 1;
            for (int i = 1; i <= num; i++)
                f *= i;

            return Optional.of(f);
        };

        var res = fact.apply(5);
        // res.ifPresentOrElse(
        // f -> System.out.println(f), () -> System.out.println("Not valid input"));

        Consumer<Number> doubleAndPrint = num -> {
            double result = num.doubleValue() * 2;
            System.out.println(result);
        };

        // doubleAndPrint.accept(5);
        // doubleAndPrint.accept(4545);

        final Random zer = new Random();
        Supplier<Integer> rollDie = () -> zer.nextInt(6) + 1;

        // System.out.println(rollDie.get());


    }
}
