public class AverageOfArray {
    public static void main(String[] args) {

        // var numbers = new int[] { 3, 5, 7, 10, 0 };

        // for (int i = 0; i < numbers.length; i++)
        // System.out.println(numbers[i]);

        // for (var el : numbers) {
        // System.out.println(el);
        // }

        // var key = 8;
        // boolean isFound = false;
        // for (var el : numbers) {
        // if (el == key) {
        // isFound = true;
        // break;
        // }
        // }

        // System.out.println(isFound ? "Var" : "Yoxdur");

        var numbers = new int[] { 3, 5, 7, 10, 0 };

        int min, max;
        min = max = numbers[0];
        for (var el : numbers) {
            // if (el < min)
            // min = el;
            // else
            // min = min;
            min = (el < min) ? el : min;
            max = (el > max) ? el : max;

        }

        System.out.println(min);
        System.out.println(max);
    }
}
