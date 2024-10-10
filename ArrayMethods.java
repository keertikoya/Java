// Keerti Koya
// 10/6/24

public class ArrayMethods {

    // add an element to end of the array
    public static int[] add(int[] arr, int a) {
        int[] temp = new int[arr.length+1]; // creates new array with length 1 greater
        for( int i = 0; i < arr.length; i++)
            temp[i] = arr[i];

        temp[temp.length-1] = a; // sets last value of array to value passed into method
        return temp;
    }

    // add an element to where you want to put it
    public static int[] add (int[] arr, int newValue, int index){
        int[] temp = new int[arr.length+1]; // creates new array with length 1 greater
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                temp[i+j] = arr[i]; // inputs all elements of passed array into new array
            }
            else {
                j++;
            }
        }
        temp[index+1] = arr[index];
        temp[index] = newValue; // sets the index of the new value to that value
        return temp;
    }

    // retrieve the item from slot placement
    public static int get(int[] arr, int placement) {
        return arr[placement]; // returns element at that index
    }

    // replaces an item at "place" with "item"
    public static int[] replace( int[] arr, int placement, int item) {
        arr[placement] = item; // replaces element with passed item value
        return arr;
    }

    // remove from end of the array and reduce size by 1
    public static int[] remove(int[] arr) {
        int[] temp = new int[arr.length - 1]; // creates a new array with size 1 less than passed array
        for (int i = 0; i < arr.length-1; i++) { // adds every element of passed array to new array (besides the last element)
            temp[i] = arr[i];
        }
        return temp; // returns updated array
    }

    // remove from place and reduce size by 1
    public static int[] remove(int[] arr, int placement) {
        int j = 0;
        int[] temp = new int[arr.length - 1]; // creates a new array with size 1 less than passed array
        for (int i = 0; i < arr.length; i++) {
            if (i != placement) { // inputs all elements of passed array into new array besides element chosen to remove
                temp[i-j] = arr[i];
            }
            else {
                j++; // skips the element chosen to remove
            }
        }
        return temp; // returns updated array
    }

    // displays every value of array
    public static void display (int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " "); // prints every element of array
        }
    }
}
