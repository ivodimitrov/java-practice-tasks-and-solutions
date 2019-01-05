package telerikacademyjavafundamentials.loops;

import java.util.Scanner;

public class CalculateComplexSum {
  /*
  Write a program that, for a given two numbers N and x, calculates the sum below.
  S=1+1!x+2!x2+⋯+N!xN
  Use only one loop. Print the result with 5 digits after the decimal point.
  Input
  On the first line you will receive one number - N
  On the second line you will receive another number - x
  Output
  Output only one number - the sum of the sequence for the given N and x
   */

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    double x = in.nextDouble();

    double factorialN = 1;
    double resultX = 1;
    double sum = 0;

    for (int i = 1; i <= n; i++) {
      factorialN *= i;
      resultX *= x;
      sum += (factorialN / resultX);
    }
    System.out.printf("%.5f", (1 + sum));
  }
}
