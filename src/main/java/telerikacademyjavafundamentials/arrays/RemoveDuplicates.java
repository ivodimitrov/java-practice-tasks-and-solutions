package telerikacademyjavafundamentials.arrays;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
  /*
  Write a program that removes all duplicates from a list of elements.
  1,2,2,2,4,7 -> 1,2,4,7.
  Maintain the relative order of the remaining items.
  */

  private static void testInput() {
    String inputString = "1,2,2,2,2,18,3,12";

    ByteArrayInputStream inputStream = new ByteArrayInputStream(inputString.getBytes());
    System.setIn(inputStream);
  }

  public static void main(String[] args) {

    testInput();

    Scanner scanner = new Scanner(System.in);

    String[] list = scanner.nextLine().split(",");

    ArrayList<String> result = new ArrayList<>();

    for (String element : list) {
      if (!result.contains(element)) {
        result.add(element);
      }
    }
    System.out.println(String.join(",", result));
  }
}
