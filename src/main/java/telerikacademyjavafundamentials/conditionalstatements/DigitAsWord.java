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

    String digitString;

    switch (digit) {
      case "0":
        digitString = "zero";
        break;
      case "1":
        digitString = "one";
        break;
      case "2":
        digitString = "two";
        break;
      case "3":
        digitString = "three";
        break;
      case "4":
        digitString = "four";
        break;
      case "5":
        digitString = "five";
        break;
      case "6":
        digitString = "six";
        break;
      case "7":
        digitString = "seven";
        break;
      case "8":
        digitString = "eight";
        break;
      case "9":
        digitString = "nine";
        break;
      default:
        digitString = "not a digit";
    }
    System.out.println(digitString);
  }
}
