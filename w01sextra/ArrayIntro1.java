public class ArrayIntro1 {
    public static void main(String[] args) {

        int size = 5;

        int[] nums = new int[size]; // instantiation
        // elements: [0,0,0,0,0]
        // indices- : 0 1 2 3 4 5

        // ArrayIndexOutOfBoundsException

        System.out.print("Without init: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // Initializating with 1s
        int idx = 0;
        while (idx < nums.length) {
            nums[idx] = 1;
            idx++;
        }

        System.out.print("After init: ");
        idx = 0;
        do {
            System.out.print(nums[idx] + " ");
        } while (++idx < nums.length);
        System.out.println();
    }
}
