import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int temp;
        if (a > b) {
            // swap
            temp = a;
            a = b;
            b = temp;
        }

        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0)
                sum += i;
        }

        System.out.println(sum);
    }
}
