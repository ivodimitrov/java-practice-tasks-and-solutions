package telerikacademyjavafundamentials.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateDiscount {
  /*
  You need to calculate the discounted price for each item in your shopping cart. The discount is 65%, a real deal for you.
  Input
  On the first line, you will receive N - the number of the items in your shopping cart
  On the next N lines you will each item's price
  Output
  On each line in the output print the discounted price of the item with two digits after the decimal point
   */

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    int numberOfValuesYouMustRead;
    double inputNumbers;
    double discount = 0.65;
    double itemPriceAfterDiscount;

    numberOfValuesYouMustRead = in.nextInt();

    for (int i = 0; i < numberOfValuesYouMustRead; i++) {
      inputNumbers = in.nextDouble();
      itemPriceAfterDiscount = inputNumbers * (1 - discount);
      System.out.println(df.format(itemPriceAfterDiscount));

    }
//    Scanner sc = new Scanner(System.in);
//    DecimalFormat df = new DecimalFormat("0.00");
//    int items = sc.nextInt();
//
//    double disPrice;
//
//    for (int i = 0; i < items; i++) {
//      double price = sc.nextDouble();
//      disPrice = price * 0.35;
//      System.out.println(df.format(disPrice));
//    }
  }
}

