package telerikacademyjavafundamentials.loops;

import java.util.Scanner;

public class PrimeFactors {
  /*
  Write a program that finds the prime factors of a given non-prime number. List the factors in ascending order.
  12 = 2 2 3
  100 = 2 2 5 * 5
  Input
  On the first line you will receive one number - N
  Output
  Output each prime factor on a newline.
  Constraints
  4 <= N <= 1000
  N is guaranteed to not be a prime
   */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            System.out.println(2);
            n /= 2;
        }

        // n must be odd at this point. So we can skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }

        // This condition is to handle the case when n is a prime number greater than 2
        if (n > 2)
            System.out.println(n);
    }
}
