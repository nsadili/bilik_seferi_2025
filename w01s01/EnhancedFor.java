import java.util.Arrays;

public class EnhancedFor {
    public static void main(String[] args) {

        var numbers = new int[] { 3, 5, 7, 10, 0 };

        // for (int i = 0; i < numbers.length; i++)
        // System.out.println(numbers[i]);

        // for (int i = 0; i < numbers.length; i++)
        // numbers[i] *= 2;
        for (var el : numbers) {
            el *= 2;
            System.out.println("->" + el);
        }

        // for (var el : numbers) {
        // System.out.print(el + " ");
        // }

        System.out.println(Arrays.toString(numbers));
    }
}
