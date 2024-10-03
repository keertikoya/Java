// Keerti Koya
// 9/30/24

public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 9};
        int a = 3;
        int b = 8;
        placement(arr,a,b);
    }

    // add an element to end of the array
    public static int[] add (int[] arr, int a){
        int[] temp = new int[arr.length+1];
        for( int i = 0; i < arr.length; i++)
            temp[i] = arr[i];

        temp[temp.length-1] = a;
        return temp;
    }

    // adds an element to where you want to put it (pushes everything else back)
    public static int[] placement (int[] arr, int a, int placement){
        int[] temp = new int[arr.length+1];
        System.out.println("length: " + temp.length);
        for (int i = placement+1; i < temp.length; i++){
            temp[i] = temp[i-1];
            System.out.println("added " + temp[i-1] + " to " + temp[i]);
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        temp[placement] = a;
        return temp;
    }

//    // retrieves the item from slot number given
//    public static int get (int[] arr, int a){
//
//    }
//
//    // replace the number at place with item
//    public static int[] replace (int[] arr, int place, int item){
//
//    }
//
//    // remove element at end of array
//    public static int[] remove(int[] arr){
//
//    }
//
//    // removes element from specified index
//    public static int[] remove(int[] arr, int place){
//
//    }

    // displays every value of array
    public static void display (int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
