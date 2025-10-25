package w0401;

import java.util.HashSet;
import java.util.List;

import generics.Point;
import more_generics.SpecificProperty;
import more_generics.Utility;

public class SpecificPropertyDemo {
    public static void main(String[] args) {
        SpecificProperty<Integer> isOdd = num -> num % 2 != 0;
        SpecificProperty<Point> isInFirstQuad = point -> point.getX() > 0 && point.getY() > 0;

        List<Integer> numbers = List.of(5, 2, 7, 6, 8, 4, 2, 5, 8, 2);

        // System.out.println(new HashSet<>(Utility.filter(numbers, isOdd)));

        System.out.println(new HashSet<>(Utility.filter(numbers,
                el -> el % 2 == 0)));

    }
}
