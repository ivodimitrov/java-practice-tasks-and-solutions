package telerikacademyjavafundamentials.loops;

import java.util.Scanner;

public class MatrixNumbers {
  /*
  Write a program that reads from the console a positive integer number N and prints a matrix like in the examples below. Use two nested loops.
  Input
  The input will always consist of a single line, which contains the number N
  Output
  See the examples
  Input
  2
  Output
  Copy
  1 2
  2 3
   */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        for (int row = 1; row <= number; row++) {
            for (int col = row; col <= row + number - 1; ) {
                System.out.print(col + " ");
                col++;
            }
            System.out.println();
        }
    }
}