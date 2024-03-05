import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) throws Exception {
        // fill the deck with cards
        List<Card> deck = new ArrayList<>();
        for (String value : Card.Values) {
            for (String suit : Card.Suits) {
                Card newCard = new Card(value, suit);
                deck.add(newCard);
            }
        }
        List<Card> playerHand = new ArrayList<>();
        List<Card> dealerHand = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Card newCard1 = drawCard(deck);
            playerHand.add(newCard1);
            Card newCard2 = drawCard(deck);
            dealerHand.add(newCard2);

        }
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to blackjack!");
        System.out.println("The value of an ACE automatically changes to whatever benefits you most.");
        System.out.println("The dealer's first card is a: " + dealerHand.getFirst());

        // iterate through the player's turn
        while (true) {
            System.out.println("---");
            System.out.print("Your current hand is: ");
            printHand(playerHand);
            int handTotal = getHandTotal(playerHand);
            if (handTotal >= 21) {
                break;
            }
            System.out.println("Your hand's total is " + handTotal);
            System.out.print("\nWould you like to hit or stand?: ");
            String answer = input.nextLine().toLowerCase();
            if (answer.equals("hit")) {
                Card newCard = drawCard(deck);
                System.out.println("You drew a " + newCard);
                playerHand.add(newCard);
            }
            else if (answer.equals("stand")) {
                System.out.println("You choose to stand.");
                break;
            }
            else {
                System.out.println("Invalid option!");
            }
        }
        int playerFinalTotal = getHandTotal(playerHand);
        System.out.println("-----");
        System.out.println("Your final total is: " + playerFinalTotal);
        // iterate through the dealer's turn
        // dealer stops once hand total is more than 16
        int dealerFinalTotal;
        while ((dealerFinalTotal = getHandTotal(dealerHand)) <= 16) {
            dealerHand.add(drawCard(deck));
        }
        System.out.println("-----");
        System.out.print("The dealer's final hand is: ");
        printHand(dealerHand);
        System.out.println("The dealer's final total is: " + dealerFinalTotal);
        if ((playerFinalTotal == dealerFinalTotal) || (playerFinalTotal > 21 && dealerFinalTotal > 21)) {
            System.out.println("It was a tie!");
        }
        else if (playerFinalTotal <= 21 && (playerFinalTotal > dealerFinalTotal || dealerFinalTotal > 21)) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost. . . ");
        }
        input.close();
    }
    public static void printHand(List<Card> hand) {
        System.out.print("[  ");
        for (Card card : hand) {
            System.out.print(card + "  ");
        }
        System.out.println("]");
    }
    public static Card drawCard(List<Card> deck) {
        Random random = new Random();
        return deck.remove(random.nextInt(deck.size()));
    }
    public static int getHandTotal(List<Card> hand) {
        boolean hasAce = false;
        int total = 0;
        for (Card card : hand) {
            if (card.value().equals("Ace")) {
                hasAce = true;
            }
            total += card.getIntValue();
        }
        // Aces are 11 by default but switch to 1 if the total exceeds 21.
        if (total > 21 && hasAce) {
            return total - 10;
        }
        return total;
    }
}
