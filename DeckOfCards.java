
import java.util.ArrayList;

public class DeckOfCards {
    private final String[] cardSuits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    //final = cannot be changed 
    
    private final String[] cardTypes = 
    {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
   
    private final int[] cardPoints = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1};
    
    private ArrayList <Card> deck;
    
    public DeckOfCards() {
        deck = new ArrayList <Card>();
        for(int k = 0; k < cardSuits.length; k++) {
            for(int j = 0; j < cardTypes.length; j++) {
                deck.add(new Card(cardTypes[j], cardSuits[k], cardPoints[j]));
            }
        }
    }
    
    public ArrayList getDeck() {
        return deck;
    }
    
    public ArrayList drawHand(int numberOfCards) {
        /*takes on a parameter that indicates how many cards 
         * to randomly select from deck and puts them 
         * in a new ArrayList<Card> that represents the hand
         * for example, drawHand(5) will randomly select 5 cards from deck
         * */
      //int hand = getDeck()[numberOfCards];  
      ArrayList<Card> hand = new ArrayList<Card>();
      numberOfCards = (int)(Math.random()*52);
    
      for(int i=0; i<numberOfCards; i++){
          int ranCardnum = (int)(Math.random()*52);
          Card crd = deck.get(ranCardnum);
          hand.add(crd);
        }
        return hand;
    }
    
    
    
    public void printHand(ArrayList<Card> hand) {
        //prints out the type and suit of all of the cards in a hand
       
      int numOfCards = (int)(Math.random()*52);
    
      for(int i=0; i<numOfCards; i++){
          int ranCardnum = (int)(Math.random()*52);
          Card crd = deck.get(ranCardnum);
          hand.add(crd);
        }
      for(int k=0; k<numOfCards; k++){
          Card oneCrd = hand.get(k);
     
      }
    }
}
