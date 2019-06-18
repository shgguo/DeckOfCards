import java.util.ArrayList;

public class Testr {
    private final String[] cardSuits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    //final = cannot be changed (?)
    
    private final String[] cardTypes = 
    {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
   
    private final int[] cardPoints = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1};
    
    private ArrayList <Card> deck;
    
    public Testr() {
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
    
    public static void main 
}