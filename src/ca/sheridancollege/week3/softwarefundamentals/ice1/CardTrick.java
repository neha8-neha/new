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
        
        
        String randVal = null;
        int [] cards = {1,2,3,4,5,6,7};
        String [] SUIT = {"Hearts", "Diamonds", "Spades", "Clubs"};

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            int numVal2 = cards [(int) (Math.random()*cards.length)];
            String suitVal2 = SUIT[(int)(Math.random()*SUIT.length)]; 
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setValue(numVal2);
            c.setSuit(suitVal2);
            
            randVal = numVal2 + " " + suitVal2;
            
            System.out.println(randVal);
        }
        
        Scanner input = new Scanner (System.in);
        //insert code to ask the user for Card value and suit, create their card
       System.out.println("Select any card: ");
        String userVal = input.nextLine();
        // and search magicHand here
        
        if (randVal.equalsIgnoreCase(userVal)) {
        System.out.println ("You won, congrats!!!");
         } else {
         System.out.println ("you don't win ,Sorry");
          }
    
        //Then report the result here
    
      int crd = 0;
      String suit = null;
      String myWishCard = luckyCard(crd,suit);
      
      System.out.println("Card of my wish is: " + myWishCard);
    }
    
public static String luckyCard(int number,String suit) {
        Card c = new Card ();
        int num = 4;
        String suits = "Hearts";
        String value = num + " " + suits;
        return value;
}

}