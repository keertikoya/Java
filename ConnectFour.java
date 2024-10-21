// Keerti Koya
// Period 1
// 10/20/24

import java.util.*;

public class ConnectFour {
    public static void main(String[] args) {
        String currentPlayer = "X"; // starts with Player X
        String[][] board = new String[7][6];  // 7 x 6 board
        setBoard(board);
        printBoard(board);

        boolean run = true;
        while (run) {
            getColumn(board, currentPlayer);
            printBoard(board);
            if (checkWinner(board, currentPlayer)) {
                System.out.println("Game over! " + currentPlayer + " wins!");
                run = false;
            }
            if (isBoardFull(board)) {
                System.out.println("It's a draw!");
                run = false;
            }
            currentPlayer = switchPlayer(currentPlayer);
        }
    }

    // set each cell with an empty space
    public static void setBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = " ";
            }
        }
    }

    // prints board
    public static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print("|" + board[i][j]);
            }
            System.out.println("|");
        }
        System.out.println();
    }

    // gets user's move
    public static void getColumn(String[][] board, String currentPlayer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player: " + currentPlayer);
        System.out.println("Enter a column value from 0-5: ");
        int col = scanner.nextInt();
        placePieceInColumn(board, col, currentPlayer);
    }

    // places piece into column
    public static void placePieceInColumn(String[][] board, int col, String currentPlayer) {
        for (int row = 6; row >= 0; row--) { // finds the lowest empty row in the user inputted column
            if (board[row][col].equals(" ")) {
                board[row][col] = currentPlayer;
                return;  // exit loop once the piece is placed
            }
        }
    }

    // checks if most recent move led to a winner
    public static boolean checkWinner(String[][] board, String currentPlayer) {
        // check for horizontal wins
        for (int row = 0; row < 7; row++) {
            for (int col = 0; col <= 2; col++) {
                if (board[row][col].equals(currentPlayer)
                        && board[row][col + 1].equals(currentPlayer)
                        && board[row][col + 2].equals(currentPlayer)
                        && board[row][col + 3].equals(currentPlayer)) {
                    return true;
                }
            }
        }

        // check for vertical wins
        for (int row = 0; row <= 3; row++) {
            for (int col = 0; col < 6; col++) {
                if (board[row][col].equals(currentPlayer)
                        && board[row + 1][col].equals(currentPlayer)
                        && board[row + 2][col].equals(currentPlayer)
                        && board[row + 3][col].equals(currentPlayer)) {
                    return true;
                }
            }
        }

        // check for diagonal wins
        for (int row = 3; row < 7; row++) {
            for (int col = 0; col < 6; col++) {
                if (col <= 2 && board[row][col].equals(currentPlayer)
                        && board[row - 1][col + 1].equals(currentPlayer)
                        && board[row - 2][col + 2].equals(currentPlayer)
                        && board[row - 3][col + 3].equals(currentPlayer)) {
                    return true;
                }
            }
        }
        for (int row = 0; row <= 3; row++) {
            for (int col = 0; col < 6; col++) {
                if (col <= 2 && board[row][col].equals(currentPlayer)
                        && board[row + 1][col + 1].equals(currentPlayer)
                        && board[row + 2][col + 2].equals(currentPlayer)
                        && board[row + 3][col + 3].equals(currentPlayer)) {
                    return true;
                }
            }
        }

        return false;
    }

    // switches player after every move
    public static String switchPlayer(String currentPlayer) {
        if (currentPlayer.equals("X"))
            return "O";
        else
            return "X";
    }

    // checks if the board is full to determine a tie
    public static boolean isBoardFull(String[][] board) {
        for (int col = 0; col < 6; col++) {
            if (board[0][col].equals(" ")) {
                return false;
            }
        }
        return true;
    }
}
