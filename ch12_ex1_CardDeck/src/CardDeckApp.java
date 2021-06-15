import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class CardDeckApp {

    public static void main(String[] args) {
        System.out.println("DECK");
        List<String> deck = getDeck();
        displayCards(deck);

        System.out.println("SHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck);

        int count = 2;
        System.out.println("HAND OF " + count + " CARDS");
        List<String> hand = dealCards(deck, count);
        displayCards(hand);
    }

    private static List<String> getDeck() {
        List<String> suits = new ArrayList<>();
        suits.add("Spades");
        suits.add("Diamonds");
        suits.add("Hearts");
        suits.add("Clubs");
        
        List<String> ranks = new ArrayList<>();
        ranks.add("Ace");
        ranks.add("2");
        ranks.add("3");
        ranks.add("4");
        ranks.add("5");
        ranks.add("6");
        ranks.add("7");
        ranks.add("8");
        ranks.add("9");
        ranks.add("10");
        ranks.add("Jack");
        ranks.add("Queen");
        ranks.add("King");
       
            
        List<String> deck = new ArrayList<>(52);
        int i = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[i] = rank + " of " + suit;
                i++;
            }
        }
        return deck;
    }

    private static void displayCards(List<String> hand) {
        System.out.print("|");        
        for (String card : hand) {
            System.out.print(card + "|");
        }
        System.out.println();        
    }

    private static void shuffleDeck(List<String> deck) {
        for (int i = 0; i < deck.size(); i++) {
            String savedCard = deck[i];
            int randomIndex = (int) (Math.random() * deck.length-1);
            deck[i] = deck[randomIndex];
            deck[randomIndex] = savedCard;
        }
    }

    private static List<String> dealCards(List<String> deck, int count) {
        List<String> hand = Arrays.copyOf(deck, 0, count);
        return hand;
    }
}