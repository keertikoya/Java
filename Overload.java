// Keerti Koya
// 9/30/24

public class Overload {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        add (a,b);
        double c = 6.0;
        double d = 4.3;
        add (c,d);

        System.out.println(outsideMethods.add(a,b));
        System.out.println(outsideMethods.add(c,d));
    }

    public static void  add (int a, int b){
        System.out.println("using the first method");
        System.out.println(a+b);
    }

    public static void add (double a, double b){
        System.out.println("using the second method");
        System.out.println(a+b);
    }
}
