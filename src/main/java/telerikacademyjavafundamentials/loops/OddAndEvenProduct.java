package telerikacademyjavafundamentials.loops;

import java.util.Scanner;

public class OddAndEvenProduct {
  /*
  You are given N integers (given in a single line, separated by a space).
  Write a program that checks whether the product of the odd elements is equal to the product of the even elements.
  Elements are counted from 1 to N, so the first element is odd, the second is even, etc
  Input
  On the first line you will receive the number N
  On the next N lines you will receive numbers
  Output
  If the two products are equal, output a string in the format yes PRODUCT_VALUE, otherwise write on the console no ODD_PRODUCT_VALUE EVEN_PRODUCT_VALUE
   */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] sequence = new int[n];

        int sumEven = 1;
        int sumOdd = 1;

        for (int i = 0; i < n; i++) {
            sequence[i] = in.nextInt();
        }

        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                sumEven *= sequence[j];
            }
        }

        for (int k = 0; k < n; k++) {
            if (k % 2 != 0) {
                sumOdd *= sequence[k];
            }
        }

        if (sumEven == sumOdd) {
            System.out.println("yes " + sumEven);
        } else System.out.println("no " + sumEven + " " + sumOdd);
    }
}

