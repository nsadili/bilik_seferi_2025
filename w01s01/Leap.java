import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();
        boolean isLeap = false;

        // if (year % 400 == 0)
        // isLeap = true;
        // else if (year % 4 == 0 && year % 100 != 0)
        // isLeap = true;
        // else
        // isLeap = false;

        // if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        // isLeap = true;
        // else
        // isLeap = false;

        isLeap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

        // if (isLeap)
        // System.out.println(year + " is a leap year");
        // else
        // System.out.println(year + " is NOT a leap year");

        System.out.println(
                year + " is " + (isLeap ? "" : "NOT ") + "a leap year");

    }
}
