package telerikacademyjavafundamentials.conditionalstatements;

import java.util.Scanner;

public class BiggestOfFive {
  /*
  Write a program that finds the biggest of 5 numbers that are read from the console, using only 5 if statements.
  Input
  On the first 5 lines you will receive the 5 numbers, each on a separate line
  Output
  On the only output line, write the biggest of the 5 numbers
   */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String a = in.nextLine();
        String b = in.nextLine();
        String c = in.nextLine();
        String d = in.nextLine();
        String e = in.nextLine();

        double ad = Double.parseDouble(a);
        double bd = Double.parseDouble(b);
        double cd = Double.parseDouble(c);
        double dd = Double.parseDouble(d);
        double ed = Double.parseDouble(e);

        if ((ad >= bd) && (ad >= cd) && (ad >= dd) && (ad >= ed)) {
            System.out.println(a);
            return;
        }
        if ((bd >= ad) && (bd >= cd) && (bd >= dd) && (bd >= ed)) {
            System.out.println(b);
            return;
        }
        if ((cd >= ad) && (cd >= bd) && (cd >= dd) && (cd >= ed)) {
            System.out.println(c);
            return;
        }
        if ((dd >= ad) && (dd >= bd) && (dd >= cd) && (dd >= ed)) {
            System.out.println(d);
            return;
        }
        System.out.println(e);
    }
}
