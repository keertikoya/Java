// Keerti Koya
// Period 1
// 9/19/24

import java.util.*;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = new int[7]; // creates array

        System.out.println("Please enter 7 numbers each on a new line: "); // user input instructions
        Scanner scanner = new Scanner(System.in);
        arr[0] = scanner.nextInt(); // assigns each user inputted var to array
        scanner.nextLine();
        arr[1] = scanner.nextInt();
        scanner.nextLine();
        arr[2] = scanner.nextInt();
        scanner.nextLine();
        arr[3] = scanner.nextInt();
        scanner.nextLine();
        arr[4] = scanner.nextInt();
        scanner.nextLine();
        arr[5] = scanner.nextInt();
        scanner.nextLine();
        arr[6] = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < 7; i++){ // sorts array
            for (int j = 1; j <= 6; j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int largestNum = arr[0]; // stores last array
        for (int i = 0; i < 6; i++){ // moves everything down an index
            arr[i] = arr[i+1];
        }
        arr[6] = largestNum; // sets largest num to last index of array

        System.out.println("This is your sorted array!");
        for (int i = 0; i < 7; i++){ // prints sorted array
            System.out.print(arr[i] + " ");
        }
    }
}
