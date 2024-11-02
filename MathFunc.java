// Keerti Koya
// Period 1
// 10/16/24

import java.util.*;

public class MathFunc {
    public static void main(String[] args) {

        // absolute value
        int x = -5;
        x = Math.abs(x);
        System.out.println(x);

        double y = -5.0;
        System.out.println(Math.abs(y));

        // always returns a double
        System.out.println(Math.pow(5,4));

        // square root
        System.out.println(Math.sqrt(2));

        // random 0 <= x < 1
        System.out.println(Math.random());

        System.out.println((Math.random() + 1)*2);
    }
}
