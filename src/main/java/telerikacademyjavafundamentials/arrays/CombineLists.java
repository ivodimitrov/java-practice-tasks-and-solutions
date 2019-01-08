package telerikacademyjavafundamentials.arrays;

import java.util.Scanner;

public class CombineLists {
  /*
  Write a program that reads two lists of numbers and combines them by alternatingly taking elements:
  combine 1,2,3 and 7,8,9 -> 1,7,2,8,3,9
  you can assume that the input lists will have the same length.
  Print the resulting combined list to the output, separating elements with a comma.
  Input
  On the first line you will receive the first list.
  On the second line -> 2nd list.
  Output
  On the only line of output, print all the numbers in format n1,n2,n3,..n
   */

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

//    String inputValues1 = in.nextLine();
//    String[] inputArray1 = inputValues1.split(",");
    String[] inputArray1 = in.nextLine().split(",");

//    String inputValues2 = in.nextLine();
//    String[] inputArray2 = inputValues2.split(",");
    String[] inputArray2 = in.nextLine().split(",");

//    int[] array1 = new int[inputArray1.length];
//    int[] array2 = new int[inputArray2.length];

    for (int i = 0; i < inputArray1.length; i++) {
//      array1[i] = Integer.parseInt(inputArray1[i]);
//      array2[i] = Integer.parseInt(inputArray2[i]);
      if (i < inputArray1.length - 1) {
//        System.out.print(array1[i] + ",");
//        System.out.print(array2[i] + ",");
        System.out.print(inputArray1[i] + ",");
        System.out.print(inputArray2[i] + ",");
      } else {
//        System.out.print(array1[i] + ",");
//        System.out.print(array2[i]);
        System.out.print(inputArray1[i] + ",");
        System.out.print(inputArray2[i]);
      }
    }
  }
}
