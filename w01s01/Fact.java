import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        // if (n < 0) {
        // System.out.println("Sen ozunu agilli aparmadin!");
        // } else {

        // int f = 1;
        // for (int counter = 1; counter <= n; counter++) {
        // f = f * counter;
        // }

        // System.out.println(f);
        // }

        if (n < 0) {
            System.out.println("Sen ozunu agilli aparmadin!");
            // return; //return from the current method: main
            System.exit(1); // exit the program, ignoring all the callstack
        }

        int f = 1;
        for (int counter = 1; counter <= n; counter++) {
            f = f * counter;
        }

        System.out.println(f);

    }
}
