public class LinearSearch {
    public static void main(String[] args) {

        int nums[] = new int[] { 3, 2, 4, 5, 6, 2, 5 };
        // 1: first occurence -> 1
        // 2: last occurence -> 5
        // 3: all occ.s -> 1, 5
        int key = 10;

        // int count = 0;
        // for (var i = 0; i < nums.length; i++) {
        // if (nums[i] == key) {
        // System.out.println("Found at pos " + i);
        // count++;
        // }
        // }
        // System.out.printf("Total %d occurences found!\n", count);

        int foundIdx = -1;
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] == key)
                foundIdx = i;
        }
        // if (foundIdx != -1)
        // System.out.println("Found at pos " + foundIdx);
        // else
        // System.out.println("Not found!");
        System.out.println((foundIdx != -1)
                ? "Found at pos " + foundIdx
                : "Not found!");

        // TODO: fix for not found case
        // for (int i = nums.length - 1; i >= 0; i--) {
        // if (nums[i] == key) {
        // System.out.println("Found at pos " + i);
        // break;
        // }
        // }

    }
}