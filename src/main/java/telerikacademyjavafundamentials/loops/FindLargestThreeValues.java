package telerikacademyjavafundamentials.loops;

import java.util.Scanner;

public class FindLargestThreeValues {
  /*
  Write a program that, that finds the three largest numbers in a sequence and prints them in descending order in the following format:
  {largest}, {second_largest} and {third_largest}.
  Input
  On the first line you will receive one number - N - the count of numbers to follow.
  On the next N lines you will receive the sequence of numbers, each on a new line.
  Output
  Output the three largest numbers in the already described format.
   */

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int[] arr = new int[n];

    int i, largest, secondLargest, thirdLargest;

    largest = secondLargest = thirdLargest = Integer.MIN_VALUE;

    for (i = 0; i < arr.length; i++) {

      arr[i] = in.nextInt();

      if (arr[i] > largest) {
        thirdLargest = secondLargest;
        secondLargest = largest;
        largest = arr[i];
      } else if (arr[i] > secondLargest) {
        thirdLargest = secondLargest;
        secondLargest = arr[i];
      } else if (arr[i] > thirdLargest)
        thirdLargest = arr[i];
    }
    System.out.println(largest + ", " + secondLargest + " and " + thirdLargest);
  }
}
