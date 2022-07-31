package telerikacademyjavafundamentials.arrays;

import java.util.Scanner;

public class ReverseNumbers {
  /*
  Write a program that reads a list of numbers separated by a comma and space.
  Reverse the numbers.
  Output all numbers on a single line, separated by a comma and a space.
  Input
  On the only line you will receive all the numbers to be reversed.
  Output
  On the only line of output, print all the numbers reversed in format n1, n2, n3, .. n
   */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String inputValues = in.nextLine();
        String[] inputArray = inputValues.split(", ");

        int[] array = new int[inputArray.length];

        for (int i = inputArray.length - 1; i >= 0; i--) {

            array[i] = Integer.parseInt(inputArray[i]);

            if (i > 0) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
    }
}
