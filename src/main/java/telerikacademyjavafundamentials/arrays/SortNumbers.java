package telerikacademyjavafundamentials.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
  /*
  Write a program that reads a list of numbers separated by a comma and space.
  Arrange the numbers in descending order.
  Output all numbers on a single line, separated by a comma and a space.
  Input
  On the only line you will receive all the numbers to be sorted.
  Output
  On the only line of output, print all the numbers sorted in format n1, n2, n3, .. n
   */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String inputValues = in.nextLine();
        String[] inputArray = inputValues.split(", ");

        Integer[] array = new Integer[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            array[i] = Integer.parseInt(inputArray[i]);
        }

        Arrays.sort(array);

        for (int i = inputArray.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
    }
}
