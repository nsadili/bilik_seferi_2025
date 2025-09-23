import java.util.Scanner;

public class SumV3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the input: ");
        int n = scan.nextInt();

        // int grades[] = new int[n];
        // int[] grades = new int[n];
        var grades = new float[n];

        float sum = 0.0f;

        for (int i = 0; i < n; i++) {
            grades[i] = scan.nextFloat();
            sum += grades[i];
        }

        float avg = sum / n;
        System.out.println("Average of the group: " + avg);

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > avg)
                System.out.print(grades[i] + " ");
        }

        scan.close();
    }
}
