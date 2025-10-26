package w0402;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import generics.Account;

public class StreamDemo {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[] { 6, 3, 20, 5, 10, 2, 4, 5, 6, 7 };

        var stream = Arrays.stream(numbers);

        // stream.forEach(System.out::println);

        // stream = Arrays.stream(numbers);
        // System.out.println(stream.allMatch((n) -> n == 10));

        // var diceResults = Stream.generate(() -> new Random().nextInt(6) + 1)
        // .limit(10);
        // diceResults.forEach(System.out::println);

        // System.out.println(stream.count());

        // System.out.println(stream.filter(n -> n % 2 == 0).count());

        // var res = stream.filter(n -> n > 10).findAny().orElse(-1);
        // System.out.println(res);

        // stream.sorted((a, b) -> b - a).forEach(System.out::println);

        // var sortedInDesc = stream.sorted((a, b) -> b -
        // a).collect(Collectors.toList());
        // System.out.println(sortedInDesc);

        var halfOfEvens = stream.filter(n -> n % 2 == 0)
                .map(n -> n / 2)
                .collect(Collectors.toSet());

        System.out.println(halfOfEvens);

        var names = new ArrayList<>(List.of("afdsf", "sdgf", "sgfdgfd"));
        System.out.println(names.stream().mapToInt(String::length).sum());
        
    }
}
