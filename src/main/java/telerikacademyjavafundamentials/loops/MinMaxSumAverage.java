package telerikacademyjavafundamentials.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MinMaxSumAverage {
  /*
  Write a program that reads from the console a sequence of N real numbers and returns the minimal, the maximal number, the sum and the average of all numbers (displayed with 2 digits after the decimal point).
  Input
  On the first line, you will receive the number N
  Output
  Your output must always consist of exactly 4 lines - the minimal element on the first line, the maximal on the second, the sum on the third and the average on the fourth
   */

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    int numberOfValuesYouMustRead;
    double inputNumbers;
    double sum = 0;
    int count = 0;
    double average;
    double min = Double.MAX_VALUE;
    double max = Double.MIN_VALUE;

    numberOfValuesYouMustRead = in.nextInt();

    for (int i = 0; i < numberOfValuesYouMustRead; i++) {
      inputNumbers = in.nextDouble();
      sum = sum + inputNumbers;

      if (inputNumbers < min) {
        min = inputNumbers;
      }
      if (inputNumbers > max) {
        max = inputNumbers;
      }

      count++;
    }
    average = (sum / count);
    System.out.println("min=" + df.format(min));
    System.out.println("max=" + df.format(max));
    System.out.println("sum=" + df.format(sum));
    System.out.println("avg=" + df.format(average));
  }
}

