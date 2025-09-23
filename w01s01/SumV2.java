import java.util.Scanner;

public class SumV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float sum = 0.0f;
        int count = 0;

        while (scan.hasNextFloat()) {
            sum += scan.nextFloat();
            count++;
        }

        // TODO: convert the following to ternary-if
        if (count > 0) {
            float avg = sum / count;
            System.out.println(avg);
        } else {
            System.out.println("No valid input detected!");
        }

        scan.close();
    }
}
