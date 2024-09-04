// Keerti Koya
// Period 1
// 9/4/24

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Input a number to reverse! ");
        int x = inp.nextInt();
        inp.nextLine();

        while (x > 0){
            System.out.print(x % 10); // takes last digit
            x /= 10; // updates x int without last digit
        }
    }
}
