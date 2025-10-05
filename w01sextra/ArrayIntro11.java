import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        float nums[] = new float[size];

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("Enter element in %d position: ", i);
            nums[i] = scan.nextFloat();
        }
        scan.close();

        // for (var el : nums) {
        // el *= 2;
        // System.out.print(el + " ");
        // }
        // System.out.println();

        System.out.println(Arrays.toString(nums));

        float sum = 0;
        for (var el : nums)
            sum += el;

        System.out.println("Sum = " + sum);
        if (nums.length != 0) {
            float avg = sum / nums.length;
            System.out.println("Avg = " + avg);
        } else {
            System.out.println("No valid input!");
        }
    }
}

// [1,2,3,4,5]
//
