package w0401;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionPackageDemo {
    public static void main(String[] args) {

        Predicate<String> isValidUsername = str -> str != null && str.trim().length() > 5;

        System.out.println(isValidUsername.negate().test(null));

        Function<Integer, Optional<Long>> fact = num -> {
            if (num < 0)
                return Optional.empty();

            long f = 1;
            for (int i = 1; i <= num; i++)
                f *= i;

            return Optional.of(f);
        };

        var res = fact.apply(5);
        res.ifPresentOrElse(
                f -> System.out.println(f), () -> System.out.println("Not valid input"));

    }
}
