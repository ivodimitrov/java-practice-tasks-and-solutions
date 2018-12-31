package telerikacademyjavafundamentials.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FindAverage {
  /*
  You need to calculate the average of a collection of values. Every value will be valid number.
  The average must be printed with two digits after the decimal point.
  Input
  On the first line, you will receive N - the number of the values you must read
  On the next N lines you will receive numbers.
  Output
  On the only line of output, print the average with two digits after the decimal point.
   */

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    int numberOfValuesYouMustRead;
    double inputNumbers;
    double sum = 0;
    int count = 0;

    numberOfValuesYouMustRead = in.nextInt();

    for (int i = 0; i < numberOfValuesYouMustRead; i++) {
      inputNumbers = in.nextDouble();
      sum = sum + inputNumbers;
      count++;
    }
    System.out.println(df.format(sum / count));
  }
}
