package telerikacademyjavafundamentials.loops;

import java.util.Scanner;

public class ConvertDegrees {
  /*
  You need to provide conversion of the temperature given in Celsius to their Fahrenheit representation.
  T(°F) = T(°C) × 1.8 + 32
  Input
  On the first line, you will receive a list of values separated by a single space.
  Output
  On each line in the output print the converted temperature
   */

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    double celsius;
    double fahrenheit;

    String inputValues = in.nextLine();
    String[] elements = inputValues.split(" ");

    for (String element : elements) {
      celsius = Double.parseDouble(element);
      fahrenheit = (celsius * 1.8) + 32;

      if (fahrenheit % 1 == 0) {
        System.out.printf("%.0f%n", fahrenheit);
      } else {
        System.out.printf("%.1f%n", fahrenheit);
      }
    }
  }
}

