// Keerti Koya
// Period 1
// 10/21/24

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        Integer x = 9; // object Integer
        Integer y = 10;
        Integer z = 11;

        ArrayList<Integer> box = new ArrayList<>(); // undefined length
        box.add(x); // adds to the end
        box.add(y);
        box.add(z);

        System.out.println(box); // prints all values

        box.add (1,14); // add a specific value (14) at a specific index (1). everything else is auto pushed back
        System.out.println(box);

        System.out.println(box.get(2)); // gets the value at specified index

        box.remove(3); // deletes the value at the specified index
        System.out.println(box);

        System.out.println(box.size()); // prints the # of elements in the ArrayList

        box.set(0,99); // sets the value at the specified index to be the specified element
        System.out.println(box);

        ArrayList<String> a = new ArrayList<>();
        ArrayList<Double> b = new ArrayList<>();
        ArrayList<int[]> c = new ArrayList<>();
    }
}

