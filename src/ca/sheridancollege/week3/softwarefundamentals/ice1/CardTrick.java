package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/** Neha Neha
 * 991560290
 */
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 */
        
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        
        String randomVal = null;
        int [] cards = {1,2,3,4,5,6,7};
        String [] SUIT = {"Hearts", "Diamonds", "Spades", "Clubs"};

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            int numVal = cards [(int) (Math.random()*cards.length)];
            String suitVal = SUIT[(int)(Math.random()*SUIT.length)]; 
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue(numVal);
            c.setSuit(suitVal);
            
            randomVal = numVal + " " + suitVal;
            
            System.out.println(randomVal);
        }
        
        Scanner input = new Scanner (System.in);
        //insert code to ask the user for Card value and suit, create their card
       System.out.println("Pick a card: ");
        String userVal = input.nextLine();
        // and search magicHand here
        
        if (randomVal.equalsIgnoreCase(userVal)) {
        System.out.println ("You won!!!");
         } else {
         System.out.println ("Sorry");
          }
    
        //Then report the result here
    
      int crd = 0;
      String suit = null;
      String cardOfMyWish= luckyCard(crd,suit);
      
      System.out.println("Card of my wish is: " + cardOfMyWish);
    }
public static String luckyCard(int number,String suit) {
        Card c = new Card ();
        int num = 4;
        String suits = "Hearts";
        String value = num + " " + suits;
        return value;
}

}