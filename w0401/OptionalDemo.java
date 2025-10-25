package w0401;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        var res = max(2, 3, 4, 6, 2, 65, 8);
        // var res = max();
        // if (res.isPresent())
        // System.out.println(res.get());
        // else
        // System.out.println("No result returned!");

        // res.ifPresentOrElse(
        // (value) -> System.out.println(value),
        // () -> System.out.println("Not found"));

        res.ifPresentOrElse(System.out::println, () -> System.out.println("Not found"));
    }

    static Optional<Integer> max(int... args) {
        if (args.length == 0)
            return Optional.empty();

        int max = args[0];
        for (int el : args)
            if (el > max)
                max = el;
        return Optional.of(max);
    }
}
