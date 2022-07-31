package telerikacademyjavafundamentials.loops;

import java.util.Scanner;

public class PrintDeckOfCards {
  /*
  Write a program that reads a card sign(as a string) from the console and generates and prints all possible cards from a standard deck of 52 cards up to the card with the given sign(without the jokers).
  The cards should be printed using the classical notation (like 5 of spades, A of hearts, 9 of clubs; and K of diamonds).
  The card faces should start from 2 to A(10 is 10).
  Print each card face in its four possible suits: clubs, diamonds, hearts and spades.
  The order of cards is '2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K', 'A'.
  Input
  On the only line, you will receive the sign of the card to which, including, you should print the cards in the deck.
  Output
  The output should follow the format bellow
  2 of spades, 2 of clubs, 2 of hearts, 2 of diamonds
  3 of spades, 3 of clubs, 3 of hearts, 3 of diamonds
  4 of spades, 4 of clubs, 4 of hearts, 4 of diamonds
  5 of spades, 5 of clubs, 5 of hearts, 5 of diamonds
   */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String currentCard = in.nextLine();
        int endCard = switch (currentCard) {
            case "2" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "10" -> 10;
            case "J" -> 11;
            case "Q" -> 12;
            case "K" -> 13;
            case "A" -> 14;
            default -> 0;
        };

        for (int card = 2; card <= endCard; card++) {
            for (int color = 0; color < 4; color++) {
                switch (card) {
                    case 2 -> System.out.print("2");
                    case 3 -> System.out.print("3");
                    case 4 -> System.out.print("4");
                    case 5 -> System.out.print("5");
                    case 6 -> System.out.print("6");
                    case 7 -> System.out.print("7");
                    case 8 -> System.out.print("8");
                    case 9 -> System.out.print("9");
                    case 10 -> System.out.print("10");
                    case 11 -> System.out.print("J");
                    case 12 -> System.out.print("Q");
                    case 13 -> System.out.print("K");
                    case 14 -> System.out.print("A");
                }
                switch (color) {
                    case 0 -> System.out.print(" of spades, ");
                    case 1 -> System.out.print(" of clubs, ");
                    case 2 -> System.out.print(" of hearts, ");
                    case 3 -> {
                        System.out.print(" of diamonds");
                        System.out.println();
                    }
                }
            }
        }
    }
}


