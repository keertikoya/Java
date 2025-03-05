import java.util.ArrayList;
import java.util.Scanner;

public class Checkers {
    static char[][] board = new char[8][8]; // board dimensions as a 2D array
    static ArrayList<Piece> blackPieces = new ArrayList<>(); // arraylist of black pieces
    static ArrayList<Piece> redPieces = new ArrayList<>(); // arraylist of red pieces
    static Scanner scanner = new Scanner(System.in);
    static boolean isBlackTurn = true; // used to determine which player's turn it is

    public static void main(String[] args) {

        // creates the board
        System.out.println("    ");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 1 && i < 3) {
                    board[i][j] = 'R';
                    redPieces.add(new Piece(i, j)); // adds red pieces to top rows of board
                }
                else if ((i + j) % 2 == 1 && i > 4) {
                    board[i][j] = 'B';
                    blackPieces.add(new Piece(i, j)); // adds black pieces to bottom rows of board
                }
                else {
                    board[i][j] = ' ';
                }
            }
        }

        printBoard(); // prints board for user to see
        char playerSymbol;

        while (true) {
            String currentPlayer;
            if (isBlackTurn) { // checks whose turn it is
                currentPlayer = "Black";
            } else {
                currentPlayer = "Red";
            }

            // gets user input
            System.out.println("It is " + currentPlayer + "'s turn! Enter the row and then column of a piece:");
            int row = scanner.nextInt();
            scanner.nextLine();
            int col = scanner.nextInt();
            scanner.nextLine();

            // currentPieces is for the current player, opponent pieces is the other
            ArrayList<Piece> currentPieces;
            ArrayList<Piece> opponentPieces;

            if (isBlackTurn) { // assigns which array belongs to which player
                currentPieces = blackPieces;
                opponentPieces = redPieces;
                playerSymbol = 'B';
            }
            else {
                currentPieces = redPieces;
                opponentPieces = blackPieces;
                playerSymbol = 'R';
            }

            // in the case that the user chooses a space with no piece
            Piece selected = getPiece(row, col, currentPieces);
            if (selected == null) {
                System.out.println("That place has no piece.");
                continue;
            }

            // in the case that the chosen piece has no possible moves
            ArrayList<int[]> validMoves = potentialMoves(selected, currentPieces, opponentPieces);
            if (validMoves.isEmpty()) {
                System.out.println("The piece chosen has no possible moves.");
                continue;
            }

            // outputs the user's chosen piece's potential moves as row, col coordinates
            System.out.println("Potential moves:");
            for (int[] move : validMoves) {
                System.out.println("[" + move[0] + ", " + move[1] + "]");
            }

            // user input for the move
            System.out.println("Enter your move's row and column:");
            int newRow = scanner.nextInt();
            scanner.nextLine();
            int newCol = scanner.nextInt();
            scanner.nextLine();

            // if the user chooses an invalid move
            if (!isValidMove(validMoves, newRow, newCol)) {
                System.out.println("That is not a possible move.");
            }

            // if they choose a valid piece and move, move the piece and reprint the board
            movePiece(selected, newRow, newCol, currentPieces, opponentPieces);
            printBoard();


            // if the opponent's pieces have no more potential moves or they have no more pieces, the current player wins
            if (isGameOver(currentPieces, opponentPieces)) { // Check if the *opponent* has lost
                String winner;
                if (isBlackTurn) { //If it was black's turn, Red won
                    winner = "Red";
                } else { //If it was red's turn, Black won
                    winner = "Black";
                }
                System.out.println(winner + " wins!");
                break; //End the game
            }

            // swaps player
            isBlackTurn = !isBlackTurn;
        }
    }

    // visually displays board
    static void printBoard() {
        System.out.print("   "); // to align the column numbers
        for (int j = 0; j < 8; j++) {
            System.out.print(j + " ");
        }
        System.out.println(); // prints column numbers

        for (int i = 0; i < 8; i++) { // prints row numbers
            System.out.print(i + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print("|" + board[i][j]); // inputs array pieces
            }
            System.out.println("|");
        }
    }

    // accesses a piece on the board
    static Piece getPiece(int row, int col, ArrayList<Piece> pieces) {
        for (Piece p : pieces) {
            if (p.row == row && p.col == col) {
                return p;
            }
        }
        return null;
    }

    // finds potential moves
    static ArrayList<int[]> potentialMoves(Piece piece, ArrayList<Piece> ownPieces, ArrayList<Piece> opponentPieces) {
        ArrayList<int[]> moves = new ArrayList<>();
        int[][] directions;

        // if they're a king, they can move diagonally in all four directions
        if (piece.isKing) {
            directions = new int[][]{{-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        }
        // otherwise, they can only move diagonally forward
        else {
            boolean isBlackPiece = blackPieces.contains(piece);
            if (isBlackPiece) {
                directions = new int[][]{{-1, -1}, {-1, 1}}; // Black moves up
            } else {
                directions = new int[][]{{1, -1}, {1, 1}}; // Red moves down
            }
        }

        for (int[] dir : directions) {
            int newRow = piece.row + dir[0];
            int newCol = piece.col + dir[1];

            // checks to make sure the piece will still be on the board
            if (withinBoard(newRow, newCol) && board[newRow][newCol] == ' ') {
                moves.add(new int[]{newRow, newCol});
            }
            else if (withinBoard(newRow, newCol)) {
                char pieceAtNewPos = board[newRow][newCol];
                boolean isOpponentPiece = (blackPieces.contains(piece) && pieceAtNewPos == 'R') ||
                        (!blackPieces.contains(piece) && pieceAtNewPos == 'B');

                if (isOpponentPiece) {
                    int jumpRow = newRow + dir[0];
                    int jumpCol = newCol + dir[1];

                    if (withinBoard(jumpRow, jumpCol) && board[jumpRow][jumpCol] == ' ') {
                        moves.add(new int[]{jumpRow, jumpCol});
                    }
                }
            }
        }
        return moves;
    }

    // checks to see if the user inputted move exists within the list of potential moves
    static boolean isValidMove(ArrayList<int[]> validMoves, int row, int col) {
        for (int[] move : validMoves) {
            if (move[0] == row && move[1] == col) {
                return true;
            }
        }
        return false;
    }

    static void movePiece(Piece piece, int newRow, int newCol, ArrayList<Piece> ownPieces, ArrayList<Piece> opponentPieces) {
        // saves the original position
        int oldRow = piece.row;
        int oldCol = piece.col;

        // sets the original position as empty since the piece moved out
        board[oldRow][oldCol] = ' ';

        if (Math.abs(newRow - oldRow) == 2) {
            int capturedRow = (newRow + oldRow) / 2;
            int capturedCol = (newCol + oldCol) / 2;

            // removes the captured piece from the visual board
            board[capturedRow][capturedCol] = ' ';

            // removes the captured piece from the opponent's list
            for (int i = 0; i < opponentPieces.size(); i++) {
                Piece opponentPiece = opponentPieces.get(i);
                if (opponentPiece.row == capturedRow && opponentPiece.col == capturedCol) {
                    opponentPieces.remove(i);
                    break;
                }
            }
        }

        // places the piece in its new position
        if (isBlackTurn) {
            board[newRow][newCol] = 'B';
        } else {
            board[newRow][newCol] = 'R';
        }

        // updates the piece's position in the arraylist
        piece.row = newRow;
        piece.col = newCol;

        // checks to see if the piece became a king by reaching the other side
        if ((isBlackTurn && newRow == 0) || (!isBlackTurn && newRow == 7)) {
            piece.isKing = true;
        }
    }

    // checks to make sure the piece is still on the board
    static boolean withinBoard(int row, int col) {
        return (row >= 0 && row < 8 && col >= 0 && col < 8);
    }

    static boolean isGameOver(ArrayList<Piece> currentPieces, ArrayList<Piece> opponentPieces) {
        // checks if there are any opponent pieces left
        if (opponentPieces.isEmpty()) {
            return true;
        }

        // checks if any of the opponent's playing pieces have potential moves left
        for (Piece piece : opponentPieces) {
            ArrayList<int[]> moves = potentialMoves(piece, opponentPieces, currentPieces);
            if (!moves.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}

