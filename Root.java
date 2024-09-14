// Keerti Koya
// Period 1
// 9/15/24

import java.util.*;

/*
This program takes in a positive integer and simplifies the value of that number under a square root.
*/

public class Root {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creates a scanner
        System.out.println("Enter the positive integer under the root for simplification: ");

        int num = scanner.nextInt(); // get user inputted number
        scanner.nextLine();

        int answer = 1; // tracks value outside of root

        for (int i = 2; i <= 100; i++){
            while (num % (i * i)==0){ // checks if num is evenly divisible by any square
                answer *= i; // updates final answer value (outside root)
                num /= (i * i); // updates num
            }
        }
        if (num == 1) // prints perfect square value without "root"
            System.out.println(answer);
        else
            System.out.println(answer + "root" + num); // prints factored form if not perfect square
    }
}
