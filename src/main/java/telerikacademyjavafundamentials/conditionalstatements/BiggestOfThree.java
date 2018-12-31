package telerikacademyjavafundamentials.conditionalstatements;

import java.util.Scanner;

public class BiggestOfThree {
  /*
  Write a program that finds the biggest of three numbers that are read from the console.
  Input
  On the first three lines you will receive the three numbers, each on a separate line.
  Output
  On the only output line, write the biggest of the three numbers.
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
      System.out.println(x);
    } else if (yd >= xd && yd >= zd) {
      System.out.println(y);
    } else {
      System.out.println(z);
    }
  }
}
