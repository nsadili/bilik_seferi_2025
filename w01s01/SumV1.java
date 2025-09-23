import java.util.Scanner;

public class SumV1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the input: ");
        int n = scan.nextInt();

        float x, sum = 0.0f;

        for (int i = 0; i < n; i++) {
            x = scan.nextFloat();
            sum += x;
        }

        float avg = sum / n;
        System.out.println(avg);

        scan.close();
    }
}
