package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

//pass by value vs pass by reference

public class ListsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(100);
        numbers.add(2);

        // System.out.println(numbers);
        // for (int i = 0; i < numbers.size(); i++)
        // System.out.print(numbers.get(i) + ", ");
        // for (var num : numbers)
        // System.out.print(num + ", ");

        // var it = numbers.iterator();
        // while (it.hasNext()) {
        // var el = it.next();
        // System.out.println(el);

        // if (el > 50)
        // it.remove();
        // }

        // var listIt = numbers.listIterator(numbers.size());
        // while (listIt.hasPrevious()) {
        // var el = listIt.previous();
        // System.out.println(el);
        // }

        // System.out.println(numbers);

        var copy = new ArrayList<>(numbers);
        Collections.addAll(copy, 0, 0, 0, 0);

        copy.add(500);

        System.out.println(numbers);
        System.out.println(copy);
    }
}
