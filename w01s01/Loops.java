import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        // int counter = 0; // initialization
        // while (counter < n) { // condition
        // counter++; // update
        // System.out.print(counter + " ");
        // }

        // for (counter = 1; counter <= n; counter++) {
        // System.out.print(counter + " ");
        // }

        // counter = 1;
        // for (; counter <= n;) {
        // System.out.print(counter + " ");
        // counter++;
        // }

        // for (int counter = 1; counter <= n; counter++) {
        // if (counter % 3 == 0)
        // continue;
        // System.out.print(counter + " ");
        // }

        int counter = 1;
        while (counter <= n) {

            if (counter % 3 == 0) {
                counter++;
                continue;
            }
            System.out.print(counter + " ");
            counter++;

        }
    }
}
