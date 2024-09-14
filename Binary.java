// Keerti Koya
// Period 1
// 9/15/24

import java.util.*;

/*
This program takes in a positive integer and converts it into binary form.
 */

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creates a scanner
        System.out.println("Enter a number for me to convert into binary: ");

        int num = scanner.nextInt(); // get user inputted number
        scanner.nextLine();

        String binary = ""; // creates a string to add remainders to
        while (num > 0){
            binary = (num % 2) + binary; // adds remainder to front of the string
            num = num / 2; // update num
        }
        System.out.println(binary); // print answer
    }
}
