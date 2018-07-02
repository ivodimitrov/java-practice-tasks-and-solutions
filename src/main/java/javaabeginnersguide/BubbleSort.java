package javaabeginnersguide;

public class BubbleSort {
    public static void main(String args[]) {
        int nums[] = {99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49};
        int a, b, t;

        // display original array
        System.out.print("Original array is:");
        for (int num : nums) {
            System.out.print(" " + num);
        }
        System.out.println();

        // This is the bubble sort.
        for (a = 1; a < nums.length; a++)
            for (b = nums.length - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {
                    // if out of order exchange elements
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }

        // display sorted array
        System.out.print("Sorted array is:");
        for (int num : nums) {
            System.out.print(" " + num);
        }
        System.out.println();
    }
}
