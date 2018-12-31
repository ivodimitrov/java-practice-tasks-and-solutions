package telerikacademyjavafundamentials.conditionalstatements;

import java.util.Scanner;

public class GuessTheSeason {
  /*
  Write a program that display the name of the season associated with a date and month. Use the following table to determine a season's start and end date.
  For example, Autumn lasts from September 22 to December 20, both inclusive.
  Season	Start Date
  Spring	March 20
  Summer	June 21
  Autumn	September 22
  Winter	December 21
  Input
  On the first line, you will receive the month as a string
  On the second line, you will receive the date as a number
  Output
  On the only line of output, print the name of the season in pascal case
   */

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    String month = in.nextLine();
    String date = in.nextLine();

    String season = "";
    int dateAsNum = Integer.parseInt(date);

    switch (month) {
      case "January":
      case "February":
        season = "Winter";
        break;
      case "March":
        if (dateAsNum < 20) {
          season = "Winter";
        } else {
          season = "Spring";
        }
        break;
      case "April":
      case "May":
        season = "Spring";
        break;
      case "June":
        if (dateAsNum < 21) {
          season = "Spring";
        } else {
          season = "Summer";
        }
        break;
      case "July":
      case "August":
        season = "Summer";
        break;
      case "September":
        if (dateAsNum < 22) {
          season = "Summer";
        } else {
          season = "Autumn";
        }
        break;
      case "October":
      case "November":
        season = "Autumn";
        break;
      case "December":
        if (dateAsNum < 21) {
          season = "Autumn";
        } else {
          season = "Winter";
        }
        break;
    }
    System.out.println(season);
  }
}
