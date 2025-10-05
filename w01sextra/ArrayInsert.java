import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayInsert {
    public static void main(String[] args) {

        // in Java arrays are fixed in size

        int nums[] = new int[] { 3, 2, 4, 5, 6, 2, 5 };
        // {3, 2, 4, 100, 5, 6, 2, 5}
        // length = 8

        int pos = 3;
        int key = 100;

        if (pos >= 0 && pos < nums.length) { // inside array boundaries
            // create a new array
            int copy[] = new int[nums.length + 1];

            for (int i = 0; i < pos; i++) // copy first part of the array
                copy[i] = nums[i];

            copy[pos] = key; // insert

            for (int i = pos; i < nums.length; i++) // copy the rest of the array
                copy[i + 1] = nums[i];

            System.out.println(Arrays.toString(nums));
            System.out.println(Arrays.toString(copy));
        }
    }
}

// 3, 2, 4, 5, 6, 2, 5
// _, _, _, _, _, _, _, _

// for (int i = 0; i < nums.length; i++) {
// if (i == pos) {
// copy[i] = key;
// copy[i + 1] = nums[i];
// } else if (i < pos)
// copy[i] = nums[i];
// else
// copy[i + 1] = nums[i];
// }