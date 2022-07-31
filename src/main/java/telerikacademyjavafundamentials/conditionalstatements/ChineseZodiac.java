package telerikacademyjavafundamentials.conditionalstatements;

import java.util.Scanner;

public class ChineseZodiac {
  /*
  The Chinese zodiac assigns animals to years according to the following table:
  Year	Animal		Year	Animal
  2000	Dragon		2006	Dog
  2001	Snake		2007	Pig
  2002	Horse		2008	Rat
  2003	Sheep		2009	Ox
  2004	Monkey		2010	Tiger
  2005	Rooster		2011	Hare
  Write a program that determines the zodiac sign for a particular year. Note that the cycle repeats itself, so 2012 will be the year of the Dragon again.
  Input
  On the first line, you will receive the year
  Output
  On the only line of output, print the corresponding zodiac Sign
   */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        String animal = "";
        int calcYear;

        if (year < 2000) {
            calcYear = 12 - ((2000 - year) % 12);
        } else {
            calcYear = (year - 2000) % 12;
        }

        switch (calcYear) {
            case 0 -> animal = "Dragon";
            case 1 -> animal = "Snake";
            case 2 -> animal = "Horse";
            case 3 -> animal = "Sheep";
            case 4 -> animal = "Monkey";
            case 5 -> animal = "Rooster";
            case 6 -> animal = "Dog";
            case 7 -> animal = "Pig";
            case 8 -> animal = "Rat";
            case 9 -> animal = "Ox";
            case 10 -> animal = "Tiger";
            case 11 -> animal = "Hare";
        }
        System.out.println(animal);
    }
}

