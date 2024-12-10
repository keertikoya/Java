// Keerti Koya
// Period 1
// 11/16/24

import java.util.*;
import java.lang.Math;

public class Blackjack {
    static ArrayList<Card> deck = new ArrayList<>(); // so it can be accessed outside of main method
    public static void main(String[] args) {
        int bankroll = 1000; // initial bankroll amount;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Single Deck Blackjack"); // game name!
        System.out.println();

        createDeck();

        while (bankroll > 0) {
            System.out.println("Bankroll: $" + bankroll); // displays bankroll amount
            System.out.print("Enter your bet: ");
            int bet = scanner.nextInt(); // enter bet amount
            scanner.nextLine();
            bankroll = round(bankroll, bet, scanner);
        }
        System.out.println("Game over! End bankroll: $" + bankroll); // game ended and final bankroll displayed
    }

    public static void createDeck() { // sets up deck
        String[] suits = {"Hearts", "Diamonds", "Clovers", "Spades"};
        int[] values = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String s : suits) { // creates all 13 value cards for each suit and creates a Card object
            for (int i = 0; i < names.length; i++) {
                deck.add(new Card(s, values[i], names[i]));
            }
        }
    }

    public static int round(int bankroll, int bet, Scanner scanner) {
        ArrayList<Card> playerHand = new ArrayList<>();
        playerHand.add(drawCard()); // user's first two cards
        playerHand.add(drawCard());

        ArrayList<Card> dealerHand = new ArrayList<>();
        dealerHand.add(drawCard()); // dealer's first two cards
        dealerHand.add(drawCard());

        System.out.println("Your hand: " + playerHand); // displays user's hand
        System.out.println("Dealer's first card: " + dealerHand.get(0)); // shows dealer's first card

        if (playerTurn(playerHand, scanner)) {
            int playerTotal = calcValue(playerHand);
            int dealerTotal = dealerTurn(dealerHand);

            System.out.println("Dealer's full hand: " + dealerHand);

            if (dealerTotal > 21 || playerTotal > dealerTotal) { // if dealer busts or user's score is closer to 21
                System.out.println("You win! Your bet value will be added to your bankroll.");
                return bankroll + bet; // player gets their bet value added to their bankroll
            }

            else if (playerTotal == dealerTotal) { // both player and dealer have same hand total
                System.out.println("Tie! You lose no money.");
                return bankroll;
            }

            else { // dealer is closer to 21
                System.out.println("Dealer wins! Your bet value will be subtracted from your bankroll.");
                return bankroll - bet;
            }
        }

        else { // player gets a hand total above 21
            System.out.println("BUST! You lose lol");
            return bankroll - bet;
        }
    }

    public static Card drawCard() {
        int index = (int) (Math.random() * deck.size()); // picks a random card from the deck
        return deck.remove(index); // returns that card from the deck so it's not picked again
    }

    public static boolean playerTurn(ArrayList<Card> playerHand, Scanner scanner) {
        while (true) {
            int total = calcValue(playerHand); // calculates the total value of all the cards in the players hand
            System.out.println("Your hand: " + playerHand);
            System.out.println("Hand total: " + total);

            if (total > 21) { // if bust or not
                return false;
            }

            System.out.print("Hit or Stand? ");
            String choice = scanner.next();
            scanner.nextLine();

            if (choice.equals("Stand")) {
                return true;
            }
            else{ // if they hit, draw a card and add it to the player's hand
                playerHand.add(drawCard());
                System.out.println("Card drawn: " + playerHand.get(playerHand.size() - 1));
            }
        }
    }


    public static int dealerTurn(ArrayList<Card> dealerHand) {
        while (calcValue(dealerHand) < 17) { // dealer must hit if they're under 17
            dealerHand.add(drawCard());
        }
        return calcValue(dealerHand);
    }

    public static int calcValue(ArrayList<Card> hand) { // calculates the total value of the hand
        int total = 0;

        for (Card card : hand) {
            if (card.name.equals("Ace"))
                total += 1; // count ace as 1 initially
            else
                total += card.value; // adds other cards' values
        }

        for (Card card : hand) {
            if (card.name.equals("Ace") && total + 10 <= 21) { // adjust aces from 1 to 11 if it helps and doesn't cause a bust
                total += 10;
            }
        }
        return total;
    }
}
