// Keerti Koya
// Period 1
// 11/18/24

import java.util.*;

public class StringConcat {
    public static void main(String[] args) {
        String a = "mission";
        String b = "san";
        String c = "jose";

        System.out.println(a + " " + b + " " + c);

        int x = 5;
        int y = 7;
        System.out.println(x + y + "cs"); // prints 12cs

        System.out.println(5 + 7 + "cs" + 5 + 7); // prints 12cs57
        // will stay an integer until a String is hit. once a String is hit, the rest is a String

        System.out.println(5 + 7 + "cs" + (5 + 7)); // prints 12cs12
        // PEMDAS applies first


        int j; // variable declaration
        j = 1; // value declaration
        int k = 1; // total variable declaration

        Shoe n = new Shoe(3, "blue", "Nike"); // total variable declaration

        String m = "Natalie";
        String l = "Natasia";
        System.out.println(l.compareTo(m));

        System.out.println("a".compareTo("c"));
    }
}
