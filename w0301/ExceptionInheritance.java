import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionInheritance {
    public static void main(String... args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        int arr[] = new int[] { 0, 2, 5, 3, 0, 5 };


        try {
            int a = arr[x];
            int b = arr[y];
            System.out.println(a / b);
        } catch (RuntimeException e) {
            System.out.println("Xeta 1");
        } finally {
            System.out.println("sonunda");
        }

        System.out.println("Program bitdi!");

        scan.close();
    }

}
