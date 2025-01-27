// Keerti Koya
// Period 1

import java.util.ArrayList;

public class StringToChar {
    public static void main(String[] args) {
        String[] arr1 = {"f", "g", "z"};
        String[] arr2 = {"c", "f", "g"};
        int n = 3;
        String[] printArray = mergeTwo(arr1, arr2, n);
        for (String i : printArray){
            System.out.print(i + " ");
        }
    }

    public static String[] mergeTwo (String[] a, String[] b, int n){
        ArrayList<Character> sorted = new ArrayList<>(); // used to store sorted characters
        String[] arr4 = new String[a.length + b.length];
        for (int i = 0; i < a.length; i++){ // iterates once through array 1
            arr4[i] = a[i];
        }
        for (int j = 0; j < b.length; j++){ // iterates once through array 2
            arr4[j + a.length] = b[j];
        }

        for (int i = 97; i <= 122 ; i++){ // uses ascii values to sort
            for (int j = 0 ; j < arr4.length; j++){
                if (arr4[j].charAt(0) == i){
                    sorted.add(arr4[j].charAt(0));
                }
            }
        }

        for (int i = 0; i < sorted.size()-1; i++){ // removes duplicates
            if (sorted.get(i) == sorted.get(i+1)){
                sorted.remove(i);
            }
        }

        String[] finalArray = new String[n];

        for (int i = 0; i <= n-1; i++){ // add first three values of sorted ArrayList to a String[]
            String toAdd = String.valueOf(sorted.get(i));
            finalArray[i] = toAdd;
        }
        return finalArray; // return array with n elements to main method
    }
}
