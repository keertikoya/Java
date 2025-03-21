// Keerti Koya
// Period 1

public class RecursionAssignment1 {

    public static void main(String[] args) { // testing the methods
        System.out.println(sumOfDigits(1234));
        System.out.println(product(3,2));
        printStarCones(4);
    }

    public static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumOfDigits(n / 10); // takes the last value of n and passes the remaining digits back in
    }


    public static int product(int a, int b) {
        if (b == 0)
            return 0;
        return a + product(a, b - 1); // adds a, b number of times
    }


    public static void printStarCones(int n) {
        if (n == 0)
            return;
        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println(); // moves to next line
        printStarCones(n - 1); // sends the number minus 1 to print that many stars
    }
}
