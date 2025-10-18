import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String... args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        // try{
        // //logic
        // }catch(/* type of exception */ | /* type of exception */){
        // //handler logic
        // }catch(/* type of exception */){
        // //handler logic
        // }finally{
        // }

        int arr[] = new int[] { 0, 2, 5, 3, 0, 5 };

        try {
            int a = arr[x];
            int b = arr[y];
            System.out.println(a / b);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Xeta");
            return;
            // System.out.println(e.getMessage());
            // System.out.println(e.getCause());
            // e.printStackTrace();
        } catch (ArithmeticException e) {
            System.exit(1); // When app exits using this method, finally can be skipped
            System.out.println("Xeta");
        }
        // catch (NullPointerException e) {
        // // swallow
        // }
        finally {
            System.out.println("sonunda");
        }

        System.out.println("Program bitdi!");

    }

}
