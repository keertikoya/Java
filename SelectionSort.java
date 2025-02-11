// Keerti Koya
// Period 1

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 1, 8, 9};
        int[] sorted = selectSort(arr);
        for (int j : sorted){
            System.out.print(j + " ");
        }
    }

    public static int[] selectSort(int[] x) {
        for (int i = 0; i < x.length - 1; i++) { // accesses every element of the array except the last one
            int smallIndex = i;
            for (int j = i + 1; j < x.length; j++) { // finds the index of the smallest element in the unsorted part of array
                if (x[j] < x[smallIndex]) {
                    smallIndex = j;
                }
            }

            int temp = x[smallIndex]; // swaps the found smallest element with the first element of the unsorted part
            x[smallIndex] = x[i];
            x[i] = temp;
        }
        return x; // returns the sorted array
    }
}


