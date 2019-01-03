package telerikacademyjavafundamentials.loops;

import java.util.Scanner;

public class From1ToN {
  /*
  Write a program that enters from the console a positive integer n and prints all the numbers from 1 to N inclusive, on a single line, separated by a whitespace.
  Input
  On the only line you will receive the number N
  Output
  On the only line of output, print all the numbers from 1 to N separated by whitespace
   */

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int number = in.nextInt();

    for (int i = 1; i <= number; i++) {
      if (i < (number)) {
        System.out.print(i + " ");
      } else {
        System.out.print(i);
      }
    }
  }
}
