// Keerti Koya
// Period 1
// 9/29/24

import java.util.*;

public class LauLiu {
    public static void main(String[] args) {
        int[] arr = new int[7]; // creates array

        System.out.println("Please enter 7 numbers each on a new line: "); // user input instructions
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++){
            arr[i] = scanner.nextInt(); // assigns each user inputted var to array
            scanner.nextLine();
        }

        for (int i = 0; i < 7; i++) { // sorts array
            for (int j = 1; j < 7; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int largestNum = arr[0]; // stores last array
        for (int i = 0; i < 6; i++) { // moves everything down an index
            arr[i] = arr[i + 1];
        }
        arr[6] = largestNum; // sets largest num to last index of array

        mean(arr);
        median(arr);
        mode(arr);
    }

    public static void mean (int[] arr){
        double sum = 0;
        for (int i = 0; i < 7; i++) { // adds to sum for use in calculating mean
            sum += arr[i];
        }
        System.out.println("This is your mean: " + (sum / 7));
    }

    public static void median (int[] arr){
        System.out.println("This is your median: " + arr[4]);
    }

    public static void mode (int[] arr){
        int[] frequency = new int[7]; // frequency array to store count of each element
        for (int i = 0; i < 7; i++) {
            int count = 1;
            for (int j = 1; j < 7; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            frequency[i] = count; // store the count of each int in the frequency array
        }

        int maxFreq = 0;
        for (int i = 0; i < 7; i++) { // find the value with the maximum frequency count
            if (frequency[i] > maxFreq) {
                maxFreq = frequency[i];
            }
        }

        System.out.print("Your modes are: ");
        boolean found = false;
        for (int i = 0; i < 7; i++) {
            if (frequency[i] == maxFreq) {
                boolean printed = false; // checks if that int has already been printed
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        printed = true;
                        break;
                    }
                }
                if (!printed) { // prints each mode
                    System.out.print(arr[i] + " ");
                    found = true;
                }
            }
        }
    }
}