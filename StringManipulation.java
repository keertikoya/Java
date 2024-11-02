// Keerti Koya
// Period 1
// 10/15/24

public class StringManipulation {
    public static void main(String[] args) {
        String x = "hello world";

        // substring
        System.out.println(x.substring(3)); // lo world
        System.out.println(x.substring(3,6)); // lo
        System.out.println(x.substring(0,8)); // hello wo
        System.out.println(x.substring(10,11));

        // length
        System.out.println(x.length()); // 11

        // indexOf
        System.out.println(x.indexOf("l")); // 2

        // compareTo
        String y = "hi world";
        String z = "hello world";
        System.out.println(x.compareTo(y)); // prints -4 because the first difference is i/e. they are 4 chars apart.
        System.out.println(x.compareTo(z)); // prints 0 because they are fully equal
     }
}
