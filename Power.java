// Keerti Koya
// Period 1
// 9/3/24

import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter your base number: "); // input base
        int base = inp.nextInt();
        inp.nextLine();

        System.out.println("Enter your exponent number: "); // input exponent
        int exponent = inp.nextInt();
        inp.nextLine();

        int sum = 1;

        while (exponent >0){ // set to power by multiplying
            sum *= base;
            exponent -= 1;
        }
        System.out.println("Your answer is: " + sum); // print final value
    }
}
