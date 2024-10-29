// Keerti Koya
// Period 1
// 10/29/24

import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many rows of Pascal's Triangle you want: ");
        int userValue = scanner.nextInt(); // user input value
        scanner.nextLine();

        int[] old = {1}; // initial array
        System.out.println(1); // starts the triangle

        for (int i = 0; i < userValue-1; i++){ // prints as many rows as the user inputted
            old = newRow(old); // passes the previous array into the newRow method
            for (int j : old){ // prints out the next line
                System.out.print(j + " ");
            }
            System.out.println(); // creates new line for next row of numbers to be printed on
        }
    }

    public static int[] newRow(int[] oldArr){
        int[] newArr = new int[oldArr.length+1]; // creates a new array of size one greater
        newArr[0] = 1; // automatically sets the first value to be 1
        newArr[newArr.length-1] = 1; // automatically sets the last value to be 1

        for (int i = 1; i < oldArr.length; i++){
            newArr[i] = oldArr[i-1] + oldArr[i]; // adds two values in previous row to form new row's values
        }
        return newArr; // returns to main method to be displayed
    }
}
