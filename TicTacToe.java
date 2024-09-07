// Keerti Koya
// Period 1
// 9/8/24

import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cell1 = " ";
        String cell2 = " ";
        String cell3 = " ";
        String cell4 = " ";
        String cell5 = " ";
        String cell6 = " ";
        String cell7 = " ";
        String cell8 = " ";
        String cell9 = " ";

        String currentPlayer = "X"; // player X goes first
        boolean gameOver = false;

        while (gameOver == false) {
            System.out.println(cell1 + "|" + cell2 + "|" + cell3);
            System.out.println("-----");
            System.out.println(cell4 + "|" + cell5 + "|" + cell6);
            System.out.println("-----");
            System.out.println(cell7 + "|" + cell8 + "|" + cell9);

            // check if a valid move was made
            boolean validMove = false;

            while (validMove == false) {
                System.out.println("Player " + currentPlayer + "'s turn.");
                System.out.print("Enter a number between 1 and 9: ");
                int move = scanner.nextInt();

                // make the move
                if (move == 1 && cell1.equals(" ")) {
                    cell1 = currentPlayer;
                    validMove = true;
                } else if (move == 2 && cell2.equals(" ")) {
                    cell2 = currentPlayer;
                    validMove = true;
                } else if (move == 3 && cell3.equals(" ")) {
                    cell3 = currentPlayer;
                    validMove = true;
                } else if (move == 4 && cell4.equals(" ")) {
                    cell4 = currentPlayer;
                    validMove = true;
                } else if (move == 5 && cell5.equals(" ")) {
                    cell5 = currentPlayer;
                    validMove = true;
                } else if (move == 6 && cell6.equals(" ")) {
                    cell6 = currentPlayer;
                    validMove = true;
                } else if (move == 7 && cell7.equals(" ")) {
                    cell7 = currentPlayer;
                    validMove = true;
                } else if (move == 8 && cell8.equals(" ")) {
                    cell8 = currentPlayer;
                    validMove = true;
                } else if (move == 9 && cell9.equals(" ")) {
                    cell9 = currentPlayer;
                    validMove = true;
                } else {
                    System.out.println("Invalid move. Enter a new number.");
                }
            }

            // check for a winner
            boolean winner = (
                            (cell1.equals(cell2) && cell2.equals(cell3) && cell1.equals(" ") == false) ||
                            (cell4.equals(cell5) && cell5.equals(cell6) && cell4.equals(" ") == false) ||
                            (cell7.equals(cell8) && cell8.equals(cell9) && cell7.equals(" ") == false) ||
                            (cell1.equals(cell4) && cell4.equals(cell7) && cell1.equals(" ") == false) ||
                            (cell2.equals(cell5) && cell5.equals(cell8) && cell2.equals(" ") == false) ||
                            (cell3.equals(cell6) && cell6.equals(cell9) && cell3.equals(" ") == false) ||
                            (cell1.equals(cell5) && cell5.equals(cell9) && cell1.equals(" ") == false) ||
                            (cell3.equals(cell5) && cell5.equals(cell7) && cell3.equals(" ") == false)
            );

            if (winner) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameOver = true;
            }

            // check for a stalemate
            boolean draw = cell1.equals(" ") == false &&
                    cell2.equals(" ") == false &&
                    cell3.equals(" ") == false &&
                    cell4.equals(" ") == false &&
                    cell5.equals(" ") == false &&
                    cell6.equals(" ") == false &&
                    cell7.equals(" ") == false &&
                    cell8.equals(" ") == false &&
                    cell9.equals(" ") == false;

            if (draw == true) {
                System.out.println("Stalemate! You're both winners!");
                gameOver = true;
            }

            // switch player
            if (gameOver == false) {
                if (currentPlayer.equals("X")) {
                    currentPlayer = "O";
                } else {
                    currentPlayer = "X";
                }
            }
        }
    }
}
