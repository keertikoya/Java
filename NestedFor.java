// 9/9/24

public class NestedFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <=5; j++){
                System.out.print("*");
            }
        }

        int n = 10; // prints multiplication table
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <=n; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        int k = 5;
        for (int i = k; i >= 1; i--){ // 5 4 3 2 1
            for (int j = 1; j <= i; j++){ // prints according to i value
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
