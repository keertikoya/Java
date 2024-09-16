// 9/16/24

public class Arrays {
    public static void main(String[] args) {
        // Arrays

        int[] y = new int[5];
        // can only hold ints
        // size cannot be changed
        // numbering starts from 0...0-4
        // can create arrays of all types of variables
        // initially...arrays have NO value

        y[0] = 30; // array indexing starts at 0
        y[1] = 11;
        y[2] = 35;
        y[3] = 23;
        y[4] = 5;

        System.out.println(y[3]); // prints third int in array
        System.out.println(y[2]);

        for (int i = 4; i >= 0; i++){
            System.out.println(y[i]); // prints every num in array
        }

        // Scoping
        int j = 5;
        {
            System.out.println(j);
            // int j = 7; CANNOT recreate parent var
            int k = 0;
            j = 7;
        }
        System.out.println(j); // prints updated value
        // System.out.println(k); CANNOT access k var
        int k = 8; // CAN recreate child
    }
}
