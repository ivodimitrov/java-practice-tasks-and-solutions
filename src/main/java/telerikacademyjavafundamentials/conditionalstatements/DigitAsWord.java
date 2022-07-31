package telerikacademyjavafundamentials.conditionalstatements;

import java.util.Scanner;

public class DigitAsWord {
  /*
  Write a program that read a digit [0-9] from the console, and depending on the input, shows the digit as a word (in English).
  Print "not a digit" in case of invalid input.
  Use a switch statement.
  Input
  The input consists of one line only, which contains the digit.
  Output
  Output a single line - should the input be a valid digits, print the english word for the digits. Otherwise, print "not a digit".
   */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String digit = in.nextLine();

        String digitString = switch (digit) {
            case "0" -> "zero";
            case "1" -> "one";
            case "2" -> "two";
            case "3" -> "three";
            case "4" -> "four";
            case "5" -> "five";
            case "6" -> "six";
            case "7" -> "seven";
            case "8" -> "eight";
            case "9" -> "nine";
            default -> "not a digit";
        };

        System.out.println(digitString);
    }
}
