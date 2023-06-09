package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise.
 * 
 * Updated by Karam on June 2023.
 */
public class CardGame {

   public static void main(String[] args) {

      Cards[] hand = new Cards[7];
      Random random = new Random();

      for (int i = 0; i < hand.length; i++) {
         Cards card = new Cards();
         card.setValue(random.nextInt(13) + 1);
         card.setSuit(Cards.SUITS[random.nextInt(4)]);
         hand[i] = card;
      }

      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the value of your card (1-10, 11 for Jack, 12 for Queen, 13 for King): ");
      int value = scanner.nextInt();
      System.out.print("Enter the suit of your card (0 for Hearts, 1 for Diamonds, 2 for Clubs, 3 for Spades): ");
      int suit = scanner.nextInt();

      Cards userCard = new Cards();
      userCard.setValue(value);
      userCard.setSuit(Cards.SUITS[suit]);

      boolean foundMatch = false;
      for (Cards card : hand) {
         if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
            foundMatch = true;
            break;
         }
      }

      if (foundMatch) {
         printInfo();
      } else {
         System.out.println("Sorry, you did not find a match.");
      }
   }

   /**
    * A simple method to print out personal information.
    * Replace this information with your own.
    */
   private static void printInfo() {
      System.out.println("Congratulations, you guessed right!\n");

      System.out.println("My name is Karam, but you can call me Th3 King\n");

      System.out.println("My career ambitions:");
      System.out.println("-- Be more active with coding");
      System.out.println("-- Have a semester of full marks\n");

      System.out.println("My hobbies:");
      System.out.println("-- Investing");
      System.out.println("-- Gaming");
      System.out.println("-- Traveling/Watching TV");
      System.out.println("-- Cruising");
   }
}
