package telerikacademyjavafundamentials.loops;

import java.util.Scanner;

public class FindMaximumValue {
  /*
  Write a program that finds the maximum number from a given sequence.
  Input
  On the first line you will receive one number - N - the count of numbers to follow.
  On the next N lines you will receive the sequence of numbers, each on a new line.
  Output
  Output only one number - the maximum number you find
  Constraints
  1 <= N <= 20
  -200 <= each number <= 200
   */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numberOfValuesYouMustRead = in.nextInt();
        double inputNumbers;
        double max = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < numberOfValuesYouMustRead; i++) {
            inputNumbers = in.nextDouble();

            if (inputNumbers > max) {
                max = inputNumbers;
            }
        }
        System.out.printf("%.0f", max);
    }
}
