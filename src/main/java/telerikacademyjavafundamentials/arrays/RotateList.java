package telerikacademyjavafundamentials.arrays;

import java.util.Scanner;

public class RotateList {
  /*
  Write a program that moves that rotates a list several times (the first element becomes last).
  list = 1,2,3,4,5 and N = 2 -> result = 3,4,5,1,2
  Note that N could be larger than the length of the list, in which case you will rotate the list several times.
  list = 1,2,3,4,5 and N = 6 -> result = 2,3,4,5,1
  Input
  On the first line you will receive the list of numbers.
  On the second line you will receive N
  Output
  On the only line of output, print the numbers separated by a space.
   */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] inputArray = in.nextLine().split(",");
        int order = in.nextInt();

        int[] arr = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = Integer.parseInt(inputArray[i]);
        }

        // rotate
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        // print
        for (int k = 0; k < inputArray.length; k++) {
            if (k < inputArray.length - 1) {
                System.out.print(arr[k] + ",");
            } else {
                System.out.print(arr[k]);
            }
        }
    }
}
