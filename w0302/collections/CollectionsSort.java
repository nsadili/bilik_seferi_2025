package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import generics.Account;

public class CollectionsSort {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 2, 3, 6, 2, 4, 7, 9, 5, 2, 6);

        // Collections.sort(numbers, new AscendingIntegerComparator());
        // Collections.sort(numbers, new DescendingIntegerComparator());

        // Collections.sort(numbers, new Comparator<Integer>() {
        // @Override
        // public int compare(Integer o1, Integer o2) {
        // return o2.compareTo(o1);
        // }
        // });

        // System.out.println(numbers);

        List<Account> accs = new ArrayList<>();
        Collections.addAll(accs, new Account("Nuraddin", "Sadili", 100.0), //
                new Account("Sadi", "Mammadov", 259.0), //
                new Account("John", "Macasio", 100.0), //
                new Account("John", "Abraham", 100.0), //
                new Account("John", "Travolta", 800.0)//
        );

        Collections.sort(accs, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(accs);
    }
}

class AscendingIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }

}

class DescendingIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }

}
