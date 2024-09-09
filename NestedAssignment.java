// Keerti Koya
// Period 1
// 9/9/24

import java.util.*;

public class NestedAssignment {
    public static void main(String[] args) {
        // Problem 1 (4 lines of 5 stars)
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Problem 2 (increasing 1 to 5)
        int k = 5;
        for (int i = 1; i <= k; i++){ // 1 2 3 4 5
            for (int j = 1; j <= i; j++){ // prints according to i value
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(); // just to leave a space between outputs

        // Problem 3 (decreasing 5 to 1)
        for (int i = k; i >= 1; i--){ // 5 4 3 2 1
            for (int j = 1; j <= i; j++){ // prints according to i value
                System.out.print("*");
            }
            System.out.println();
        }

        // Problem 4 (increasing 1 to 7)
        int t = 7;
        for (int i = 1; i <= t; i++){ // 1 2 3 4 5 6 7
            for (int j = 1; j <= i; j++){ // prints according to i value
                System.out.print(i); // prints i, i times
            }
            System.out.println();
        }

        // Problem 5 (decreasing 1 to 5 with spaces)
        int n = k;
        for (int i = 1; i <= k; i++){ // 1 2 3 4 5
            for (int j = n; j >= 1; j--){
                System.out.print(" ");
            }
            n--;
            System.out.println(i);
        }

        // Problem 6 (staircase increasing 1 to 5)
        int l = k;
        for (int i = 1; i <= k; i++){ // 1 2 3 4 5
            for (int j = l; j >= 1; j--){
                System.out.print(" ");
            }
            l--;
            for (int m = i-1; m >= 0; m--){ // prints the numbers
                System.out.print(i);
            }
            System.out.println();
        }

        // Problem 7 (odds up to 9 with '-' on either side)
        int r = 9;
        for (int i = 1; i <= 9; i+=2){ // 1 3 5 7 9
            for (int j = r; j >= 1; j--){ // prints the first -
                System.out.print("-");
            }
            r--;
            for (int m = i-1; m >= 0; m--){ // prints the numbers
                System.out.print(i);
            }
            for (int j = r+1; j >= 1; j--){ // prints the following -
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
