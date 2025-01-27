// Keerti Koya
// Period 1

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 1, 8, 9};
        int[] y = insertionSort(arr);
        for (int j : y){
            System.out.print(j + " ");
        }
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i]; // hold the value of the second element
            int j = i - 1; // index of the element before value

            while (j>=0 && arr[j] > value) { // if the earlier element is greater than the later one
                arr[j + 1] = arr[j]; // swap
                j = j - 1;
            }
            arr[j + 1] = value; // moves on to next element
        }
        return arr; // return the sorted array
    }
}
