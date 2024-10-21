// Keerti Koya
// Period 1
// 10/18/24

import java.util.*;
import java.lang.Math;

public class DiceGames {
    public static void main(String[] args) {

        System.out.println(" ____         ___   ____   ___    ___   ___  ");
        System.out.println("|      |   |   |   |      |   |  |     |   | ");
        System.out.println("|      |---|   |   |      |---|  |  -- |   | ");
        System.out.println("|      |   |   |   |      |   |  |   | |   | ");
        System.out.println(" ----         ---   ----          ---   ---  ");

        System.out.println("Welcome to Chicago! We're excited to have you play :)");

        Scanner scanner = new Scanner(System.in);
        int score1 = 0;
        int score2 = 0;
        int currentPlayer = 0; // Player 1: 0, Player 2: 1

        for (int round = 2; round <= 12; round++) { // allows for 11 rounds
            System.out.println("Round " + (round - 1) + ": The sum you want to roll is " + round);

            for (int turn = 0; turn < 2; turn++) { // swaps between turns
                if (currentPlayer == 0) {
                    System.out.println("Player 1's turn! Press enter to roll.");
                } else {
                    System.out.println("Player 2's turn! Press enter to roll.");
                }
                scanner.nextLine();

                int roll1 = (int) (Math.random() * 6) + 1; // result of dice 1
                int roll2 = (int) (Math.random() * 6) + 1; // result of dice 2
                int sum = roll1 + roll2;

                System.out.println("You rolled: " + roll1 + " and " + roll2);

                if (sum == round) {
                    System.out.println("You won the round!");
                    if (currentPlayer == 0) {
                        score1 += round; // Player 1 wins points
                    } else {
                        score2 += round; // Player 2 wins points
                    }
                } else {
                    System.out.println("You did not win any points.");
                }
                currentPlayer = changePlayer(currentPlayer); // switch players
            }
        }

        System.out.println("Game over!");
        System.out.println("Player 1's final score: " + score1);
        System.out.println("Player 2's final score: " + score2);

        if (score1 > score2) {
            System.out.println("Player 1 wins!");
        } else if (score2 > score1) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Tie!");
        }
    }

    public static int changePlayer(int currentPlayer){ // changes which player is going
        if (currentPlayer ==0)
            currentPlayer++;
        else
            currentPlayer--;
        return currentPlayer;
    }
}
