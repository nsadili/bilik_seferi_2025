package generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GenericMethodDemo2 {
    public static void main(String[] args) {

        // System.out.println(GenericMethodDemo2.minimum(3, 5, 2, 6, 7));
        // System.out.println(GenericMethodDemo2.minimum("alpha", "beta", "gamma"));
        System.out.println(GenericMethodDemo2.minimum(
                new Account("Nuraddin", "Sadili", 100.0), //
                new Account("Sadi", "Mammadov", 259.0), //
                new Account("John", "Macasio", 100.0), //
                new Account("John", "Abraham", 100.0), //
                new Account("John", "Travolta", 800.0)//
        ));

    }

    static <T extends Comparable<T>> T minimum(T... elements) {
        if (elements == null || elements.length == 0)
            throw new IllegalArgumentException("Array is empty");

        T min = elements[0];
        for (T el : elements) {
            if (el.compareTo(min) < 0)
                min = el;
        }

        return min;
    }

    // TODO: define generic max finding method
    // TODO: define generic sort method
}
