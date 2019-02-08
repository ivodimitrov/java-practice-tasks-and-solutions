package telerikacademyjavafundamentials.arrays;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class IsAListSorted {
  /*
  Write a program that checks if a list is already sorted. For a list to be sorted, the next element must NOT be smaller than the previous one.
  Input
  On the first line - you will receive a number N.
  On the next N lines, you will receive a list of numbers, separated by a comma
  Output
  There are N lines of output
  for each list you receive, print 'true' if sorted or 'false' otherwise.
   */

  private static void testInput() {
    String inputString = "3\n" +
            "1,2,3,4,5\n" +
            "1,2,8,9,9\n" +
            "1,2,2,3,2";

    ByteArrayInputStream inputStream = new ByteArrayInputStream(inputString.getBytes());
    System.setIn(inputStream);
  }

  public static void main(String[] args) {

    testInput();

    Scanner scanner = new Scanner(System.in);

    int n = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < n; i++) {
      String[] listStr = scanner.nextLine().split(",");
      boolean isSorted = true;
      for (int j = 0; j < listStr.length - 1; j++) {
        if (Integer.parseInt(listStr[j]) > Integer.parseInt(listStr[j + 1])) {
          isSorted = false;
        }
      }
      if (isSorted) {
        System.out.println("true");
      } else {
        System.out.println("false");
      }
    }
  }
}



