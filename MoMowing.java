// Keerti Koya
// Period 1

import java.util.Scanner;

public class MoMowing {
    static int length, width;
    static char[][] lawn;
    static boolean[][] visited;
    static boolean[][] reachable;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner input

        int numLawns = scanner.nextInt(); // number of lawns being mowed

        for (int x = 0; x < numLawns; x++) {
            length = scanner.nextInt(); // since input values are all given on one line
            width = scanner.nextInt();
            int startRow = scanner.nextInt();
            int startCol = scanner.nextInt();
            scanner.nextLine();

            lawn = new char[length][width]; // creates all 2D arrays
            visited = new boolean[length][width];
            reachable = new boolean[length][width];

            for (int i = 0; i < length; i++) { // fills the 2D lawn array with the input
                String line = scanner.nextLine();
                String[] values = line.split(" ");
                for (int j = 0; j < width; j++) {
                    lawn[i][j] = values[j].charAt(0);
                }
            }

            cutLawn(startRow, startCol); // checks for all reachable spots

            for (int i = 0; i < length; i++) { // prints updated lawn
                for (int j = 0; j < width; j++) {
                    if (reachable[i][j] && lawn[i][j] == '.') {
                        System.out.print(" C"); // changes to C if mowable
                    } else {
                        System.out.print(" " + lawn[i][j]);
                    }
                }
                System.out.println(); // move to next line
            }

            if (x < numLawns - 1) {
                System.out.println();
            }
        }
    }

    public static boolean canMow(int r, int c) {
        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                if (i < 0 || i >= length || j < 0 || j >= width || lawn[i][j] == 'T') { // if out of bounds or a tree, CANNOT mow that spot
                    return false;
                }
            }
        }
        return true; // if in bounds and not a tree, CAN be mowed
    }

    public static void cutLawn(int r, int c) {
        if (r < 0 || r >= length || c < 0 || c >= width || visited[r][c] || !canMow(r, c)) { // checks its in bounds, has not been visited, and can be mowed
            return;
        }

        visited[r][c] = true; // marks the spot as visited

        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                if (i >= 0 && i < length && j >= 0 && j < width) {
                    reachable[i][j] = true; // marks the 3x3 area as reachable
                }
            }
        }

        // try all four directions
        cutLawn(r - 1, c); // up
        cutLawn(r + 1, c); // down
        cutLawn(r, c - 1); // left
        cutLawn(r, c + 1); // right
    }
}

