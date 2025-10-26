package w0402;

import java.util.Arrays;
import java.util.Comparator;

import generics.Account;

public class SortElements {
    public static void main(String[] args) {
        Account[] accs = new Account[] {
                new Account("Nuraddin", "Sadili", 100.0), //
                new Account("Sadi", "Mammadov", 259.0), //
                new Account("John", "Macasio", 100.0), //
                new Account("John", "Abraham", 100.0), //
                new Account("John", "Travolta", 800.0)//
        };

        // Arrays.sort(accs, (o1, o2) ->
        // o1.getFirstname().compareTo(o2.getFirstname()));
        // Arrays.sort(accs, Comparator.comparingDouble((o -> o.getBalance())));
        Arrays.sort(accs, Comparator.comparingDouble(Account::getBalance));

        System.out.println(Arrays.toString(accs));
    }
}
