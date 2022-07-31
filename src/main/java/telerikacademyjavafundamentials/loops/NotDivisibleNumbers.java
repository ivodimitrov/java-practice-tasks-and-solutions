package telerikacademyjavafundamentials.loops;

import java.util.Scanner;

public class NotDivisibleNumbers {
  /*
  Write a program that reads from the console a positive integer N and prints all the numbers from 1 to N not divisible by 3 or 7, on a single line, separated by a space.
  Input
  On the only line you will receive the number N
  Output
  On the only line of output, print all the numbers from 1 to N, which are not divisible by 3 or 7, separated by a whitespace
   */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
