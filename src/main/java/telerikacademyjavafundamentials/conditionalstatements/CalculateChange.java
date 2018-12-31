package telerikacademyjavafundamentials.conditionalstatements;

import java.util.Scanner;

public class CalculateChange {
  /*
  Write a program that determines the least amount of coins needed for a cashier to return change.
  For example, if the price of something is 0.76 leva and the customer has paid 1 leva, the least amount of coins is 1 x 20 stotinki and 2 x 2 stotinki.
  Use coins of one lev, 50, 20, 10, 5, 2 and 1 stotinki.
  Input
  On the first line, you will receive the price in leva.
  On the second line, you will receive how much the customer has paid in leva.
  Output
  There is a variable amount of output lines.
  Print each required denomination on a new line, ordered from highest to lowest.
   */

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    double price = in.nextDouble();
    double paid = in.nextDouble();

    int change;
    int calc1lev;
    int calc50st;
    int calc20st;
    int calc10st;
    int calc5st;
    int calc2st;
    int calc1st;

    change = (int) ((paid - price) * 100);

    calc1lev = change / 100;
    calc50st = (change - calc1lev * 100) / 50;
    calc20st = (change - calc1lev * 100 - calc50st * 50) / 20;
    calc10st = (change - calc1lev * 100 - calc50st * 50 - calc20st * 20) / 10;
    calc5st = (change - calc1lev * 100 - calc50st * 50 - calc20st * 20 - calc10st * 10) / 5;
    calc2st = (change - calc1lev * 100 - calc50st * 50 - calc20st * 20 - calc10st * 10 - calc5st * 5) / 2;
    calc1st = (change - calc1lev * 100 - calc50st * 50 - calc20st * 20 - calc10st * 10 - calc5st * 5 - calc2st * 2);

    if (calc1lev != 0) {
      System.out.println(calc1lev + " x 1 lev");
    }
    if (calc50st != 0) {
      System.out.println(calc50st + " x 50 stotinki");
    }
    if (calc20st != 0) {
      System.out.println(calc20st + " x 20 stotinki");
    }
    if (calc10st != 0) {
      System.out.println(calc10st + " x 10 stotinki");
    }
    if (calc5st != 0) {
      System.out.println(calc5st + " x 5 stotinki");
    }
    if (calc2st != 0) {
      System.out.println(calc2st + " x 2 stotinki");
    }
    if (calc1st != 0) {
      System.out.println(calc1st + " x 1 stotinka");
    }
  }
}
