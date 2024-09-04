// Keerti Koya
// Period 1
// 9/3/24

import java.util.*;

public class FractionSimplifier {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the numerator: ");
        int num1 = inp.nextInt();
        inp.nextLine();

        System.out.println("Enter the denominator: ");
        int num2 = inp.nextInt();
        inp.nextLine();

        int count = 100;
        int common = 0; // stores final common multiple
        while (count <= 100 && count > 0){
            if ((num1 % count == 0) && (num2 % count == 0)){ // check if both nums are divisible
                common = count;
                count = -5; // break loop

            }
            count -= 1;
        }
        System.out.println((num1 / common) + "/" + (num2 / common)); // prints final fraction
    }
}
