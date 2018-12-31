package telerikacademyjavafundamentials.conditionalstatements;

import java.util.Scanner;

public class ChessSquareColor {
  /*
  Write a program that determines the color of a chessboard square based on its rank and file:
   - files have values from a to h
  - ranks have values from 1 to 8
  Input
  On the first line, you will receive f - the file
  On the second line, you will receive r - the rank
  Output
  On the only line of output, print light or dark, based on your calculations
   */

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    String f = in.nextLine();
    String r = in.nextLine();

    int rank = Integer.parseInt(r);

    if (rank % 2 != 0) {
      switch (f) {
        case "a":
        case "c":
        case "e":
        case "g":
          System.out.println("dark");
          break;
        default:
          System.out.println("light");
          break;
      }
    } else {
      switch (f) {
        case "b":
        case "d":
        case "f":
        case "h":
          System.out.println("dark");
          break;
        default:
          System.out.println("light");
          break;
      }
    }
  }
}
