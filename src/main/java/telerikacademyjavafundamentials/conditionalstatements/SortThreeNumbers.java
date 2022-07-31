package telerikacademyjavafundamentials.conditionalstatements;

import java.util.Scanner;

public class SortThreeNumbers {
  /*
  Write a program that enters 3 real numbers and prints them sorted in descending order.
  Use nested if statements.
  Don’t use arrays and the built-in sorting functionality.
  Input
  On the first three lines, you will receive the three numbers, each on a separate line.
  Output
  Output a single line on the console - the sorted numbers, separated by a whitespace
   */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String x = in.nextLine();
        String y = in.nextLine();
        String z = in.nextLine();

        double xd = Double.parseDouble(x);
        double yd = Double.parseDouble(y);
        double zd = Double.parseDouble(z);

        if (xd >= yd && xd >= zd) {
            if (yd >= zd) {
                System.out.println(x + " " + y + " " + z);
            } else {
                System.out.println(x + " " + z + " " + y);
            }
        } else if (yd >= xd && yd >= zd) {
            if (xd >= zd) {
                System.out.println(y + " " + x + " " + z);
            } else {
                System.out.println(y + " " + z + " " + x);
            }
        } else {
            if (xd >= yd) {
                System.out.println(z + " " + x + " " + y);
            } else {
                System.out.println(z + " " + y + " " + x);
            }
        }
    }
}
