package telerikacademyjavafundamentials.conditionalstatements;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PhoneBill {
  /*
  A phone bill plan includes 1 hour of free calls and 20 text messages for 12.00 levas. Each additional minute costs 0.10 levas and each additional message costs 0.06 levas.
  Also, the additional minutes/texts are subject to 20% sales tax. Write a program that calculates the additional charge for text, the additional charge for minutes,
  and the sales tax charge for both. Also, display the total amount paid.
  Input
  On the first line, you will receive the total amount of text messages.
  On the second line, you will receive the total amount of minutes.
  Output
  1st line - number of additional messages and additional amount paid
  2nd line - number of additional minutes and additional amount paid
  3rd line - amount paid in taxes
  4th line - total bill
   */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");

        int textMessages = in.nextInt();
        int minutes = in.nextInt();

        int freeMessages = 20;
        int calcMessages = 0;
        int freeMinutes = 60;
        int calcMinutes = 0;
        double messageCosts = 0.06;
        double minuteCosts = 0.1;
        double calcTextMessagesBill = 0;
        double calcMinutesBill = 0;
        double salesTax = 0.2;
        double additionalTaxes = 0;
        double totalBill;
        double initialTotalBill = 12.00;

        if (textMessages <= freeMessages) {
            if (minutes <= freeMinutes) {
                // messages <= 20 && minutes <= 60
                totalBill = initialTotalBill;
                printBill(f, calcMessages, calcMinutes, calcTextMessagesBill, calcMinutesBill, additionalTaxes, totalBill);
            } else {
                // messages <= 20 && minutes > 60
                calcMinutes = minutes - freeMinutes;
                calcMinutesBill = calcMinutes * minuteCosts;
                additionalTaxes = getAdditionalTaxes(calcTextMessagesBill, calcMinutesBill, salesTax);
                totalBill = getTotalBill(calcTextMessagesBill, calcMinutesBill, additionalTaxes, initialTotalBill);
                printBill(f, calcMessages, calcMinutes, calcTextMessagesBill, calcMinutesBill, additionalTaxes, totalBill);
            }
        } else {
            calcMessages = textMessages - freeMessages;
            if (minutes <= freeMinutes) {
                // messages > 20 && minutes <= 60
                calcTextMessagesBill = calcMessages * messageCosts;
            } else {
                // messages > 20 && minutes > 60
                calcMinutes = minutes - freeMinutes;
                calcTextMessagesBill = calcMessages * messageCosts;
                calcMinutesBill = calcMinutes * minuteCosts;
            }
            additionalTaxes = getAdditionalTaxes(calcTextMessagesBill, calcMinutesBill, salesTax);
            totalBill = getTotalBill(calcTextMessagesBill, calcMinutesBill, additionalTaxes, initialTotalBill);
            printBill(f, calcMessages, calcMinutes, calcTextMessagesBill, calcMinutesBill, additionalTaxes, totalBill);
        }
    }

    private static double getTotalBill(double calcTextMessagesBill, double calcMinutesBill, double additionalTaxes, double initialTotalBill) {
        double totalBill;
        totalBill = initialTotalBill + calcTextMessagesBill + calcMinutesBill + additionalTaxes;
        return totalBill;
    }

    private static double getAdditionalTaxes(double calcTextMessagesBill, double calcMinutesBill, double salesTax) {
        double additionalTaxes;
        additionalTaxes = (calcTextMessagesBill + calcMinutesBill) * salesTax;
        return additionalTaxes;
    }

    private static void printBill(DecimalFormat f, int calcTextMessages, int calcMinutes, double calcTextMessagesBill, double calcMinutesBill, double additionalTaxes, double totalBill) {
        System.out.println(calcTextMessages + " additional messages for " + f.format(calcTextMessagesBill) + " levas");
        System.out.println(calcMinutes + " additional minutes for " + f.format(calcMinutesBill) + " levas");
        System.out.println(f.format(additionalTaxes) + " additional taxes");
        System.out.println(f.format(totalBill) + " total bill");
    }
}
