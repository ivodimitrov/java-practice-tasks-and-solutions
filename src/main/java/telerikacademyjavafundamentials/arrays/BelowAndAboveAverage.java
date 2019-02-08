package telerikacademyjavafundamentials.arrays;

import java.io.ByteArrayInputStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BelowAndAboveAverage {
  /*
  Write a program that calculates the average of a list of numbers. Display the average, all the numbers below the average, and all the numbers above the average.
  Maintain the relative order of numbers.
  Input
  On the only line of input, you will receive the numbers, separated by a comma.
  Output
  On the first line, print the average, with two digits after the decimal separator.
  On the second line, print all the numbers bellow the average
  On the third line, print all the numbers above the average
  */

  private static void testInput() {
    String inputString = "3,-12,0,0,13,5,1,0,-2";

    ByteArrayInputStream inputStream = new ByteArrayInputStream(inputString.getBytes());
    System.setIn(inputStream);
  }

  public static void main(String[] args) {

    testInput();

    DecimalFormat df = new DecimalFormat("0.00");
    Scanner scanner = new Scanner(System.in);

    String[] arr = scanner.nextLine().split(",");

    double avg;
    double sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += Integer.parseInt(arr[i]);
    }

    avg = sum / arr.length;

    System.out.println("avg: " + df.format(avg));
    System.out.print("below: ");

    for (int i = 0; i < arr.length; i++) {
      if (Integer.parseInt(arr[i]) < avg) {
        System.out.print(String.join(",", arr[i]));
      }
    }

    System.out.println();
    System.out.print("above: ");

    for (int i = 0; i < arr.length; i++) {
      if (Integer.parseInt(arr[i]) > avg) {
        System.out.print(String.join(",", arr[i]));
      }
    }
  }
}

