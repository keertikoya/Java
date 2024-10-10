public class ForEach {
    public static void main(String[] args) {
        int[] x = {4, 5, 1, 8, 3};

        for (int i = 0; i < x.length; i++){ // for loop
            System.out.println(x[i]);
        }

        // SAME AS

        for (int i : x){ // for each loop
            System.out.println(i);
        }

        int[][] y = {{1,2,3}, {4,5,6},{7,8,9},{10,11,12}}; // 3x4 two dimensional array

        for (int [] arr : y){ // iterates through each array
            for (int temp : arr){ // iterates through each element in the array
                System.out.println(temp);
            }
        }
    }
}
