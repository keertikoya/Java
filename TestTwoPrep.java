public class TestTwoPrep {
    public static void main(String[] args) {

        int w = 1;
        int x = w / 2;
        double y = 3;
        int z = (int) (x + y);
        System.out.println(z);

        int[] a = {5, 6, 8, 3, 4};
        for (int j : a){
            System.out.println(j);
        }

        int[][] b = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}}; // 3x4 two dimensional array

        for (int[] arr : b){ // iterates through each array
            for (int temp : arr){ // iterates through each element in the array
                System.out.println(temp);
            }
        }
    }
}