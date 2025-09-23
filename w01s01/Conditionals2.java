import java.util.Scanner;

public class Conditionals2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y;

        if (x > 0) {
            y = x * x - 2 * x + 3;
        } else if (x == 0) {
            y = x + 3;
        } else {
            y = x * x + 3 * x - 3;
        }

        System.out.println(y);

    }
}
