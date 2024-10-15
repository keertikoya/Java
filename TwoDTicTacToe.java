// Keerti Koya
// Period 1
// 10/11/24

import java.util.*;

public class TwoDTicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] board = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };

        String player = "X"; // player X goes first
        boolean game = false;

        while (!game) {
            for (int i = 0; i < 3; i++) {
                System.out.println(board[i][0] + "|" + board[i][1] + "|" + board[i][2]); // print each board space with a | in between
                if (i < 2) {
                    System.out.println("-----"); // print each row with ------ in between
                }
            }

            // check if a valid move was made
            boolean validMove = false;
            while (!validMove) {
                System.out.println("Player: " + player);
                System.out.print("Enter a number between 1 and 9: ");
                int move = scanner.nextInt();
                scanner.nextLine();

                int row = (move - 1) / 3; // row of move
                int col = (move - 1) % 3; // col of move

                if (board[row][col].equals(" ")) { // check if the cell wasn't already filled
                    board[row][col] = player; // set that cell to the player's icon
                    validMove = true;
                }
            }

            if (Winner(board, player)) { // calls Winner method
                System.out.println(player + " wins!");
                game = true; // game ends
            }

            if (fullBoard(board) && !game) { // if the game is still running and the board is full
                System.out.println("It's a tie!");
                game = true;
            }

            if (!game) { // if the game hasn't ended (win or tie), then switch players and keep going
                if (player.equals("X")) {
                    player = "O";
                } else {
                    player = "X";
                }
            }
        }
    }

    public static boolean Winner(String[][] board, String player) { // checks if there's a winner
        for (int i = 0; i < 3; i++) { // can be used for row and col since it's a 3x3 array
            if ((board[i][0].equals(player) && board[i][1].equals(player) && board[i][2].equals(player)) ||
                    (board[0][i].equals(player) && board[1][i].equals(player) && board[2][i].equals(player))) {
                return true;
            }
        }
        // diagonals
        return (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) ||
                (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player));
    }

    public static boolean fullBoard(String[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(" ")) { // if any cell is empty, the board is not yet full
                    return false;
                }
            }
        }
        return true; // if none are empty, the board is full
    }
}