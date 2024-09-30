// Keerti Koya
// Period 1
// 9/27/24

import java.util.*;

public class ReadCode
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in); // creates scanner variable
        int[] x = new int[10]; // creates int array of 10 elements

        //WRITE ME COMMENTS IN DETAIL FOR THE CODE BELOW
        System.out.println("Please enter 10 integers"); // communication to user
        for( int i = 0; i < 10; i++) // i will take the values of 0 - 9
        {
            System.out.print("Please enter value number " + (i+1) + ": "); // asks for user input 10 times (for every i)
            x[i] = input.nextInt(); // sets the inputted int at index i in the array
            input.nextLine(); // necessary since nextInt() was ued
        }

        //WRITE ME COMMENTS IN DETAIL FOR THE CODE BELOW
        x = Sort(x); // calls Sort method

        //WRITE ME COMMENTS IN DETAIL FOR THE CODE BELOW
        int[] odd = new int[0]; // creates empty array with 0 elements
        int[] even = new int[0]; // creates empty array with 0 elements
        for( int i = 0; i< x.length; i++) // i will take the values of 0 - 9 since x was previously created with 10 elements
        {
            if( x[i]%2 == 1) // checks if int at index i of array x is even
                odd = ArrayAdd(odd, x[i]); // if so, then call the method ArrayAdd and pass the odd array and the checked int
            else // checks if int at index i of array x is odd
                even = ArrayAdd(even, x[i]); // if so, then call the method ArrayAdd and pass the even array and the checked int
        }

        //WRITE ME COMMENTS IN DETAIL FOR THE CODE BELOW
        System.out.println("Your number mountain looks like this(odd up and even down):"); // tells user program will print output
        for( int i = 0; i < odd.length; i++) // i takes the value of 0 - the length of the odd array
            System.out.print(odd[i] + " "); // prints elements in odd array
        for( int i = even.length-1; i >= 0; i--) // i takes the value of 0 - the length of the even array
            System.out.print(even[i] + " "); // prints elements in even array
    }

    //WRITE ME COMMENTS ON THE EXACT DETAIL ON HOW THE BELOW METHOD WORKS.
    public static int[] ArrayAdd(int[] a, int x) // new method with int array and int var parameters
    {
        int[] temp = new int[a.length+1]; // creates a new, temporary array with a length 1 greater than that of the array passed in
        for( int i = 0; i < a.length; i++) // i takes the value of 1 to the length of array a
            temp[i] = a[i]; // sets the odd or even value into the array

        temp[temp.length-1] = x; // sets last value to inputted even or odd value
        return temp; // returns temporary variable
    }

    //WRITE ME COMMENTS ON THE EXACT DETAIL ON HOW THE BELOW METHOD WORKS.
    //I KNOW IT SORTS, BUT I WANT DETAILS
    public static int[] Sort( int[] arr) // sort method with parameter int arr
    {
        int n = arr.length; // sets int n to equal the length of the array length
        for (int i = 0; i < n - 1; i++) // i takes the values of 0 to the length of the array - 1
            // (since the index is always one less than it's place in the array)
        {
            for (int j = 0; j < n - i - 1; j++) // creates second index to compare with previous index value
            {
                if (arr[j] > arr[j + 1]) // checks if first num is less than the number after it
                {
                    int temp = arr[j]; // sets temporary variable to equal greater value
                    arr[j] = arr[j + 1]; // swaps values
                    arr[j + 1] = temp; // sets previous index to equal the greater value stored in temp
                }
            }
        }
        return arr; // returns sorted array to main method
    }
}
