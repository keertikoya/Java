public class Methods {
    public static void main(String[] args) {
        method1();
        add(9,8);
        int a = 7;
        int b = 11;
        subtract(b,a); // ORDER MATTERS: will do 11-4
        System.out.println(multiply(a, b)); // prints c method that was returned
    }

    public static void method1(){ // will only run when called by main method
        int x = 5;
        System.out.println("hello period 1");
        System.out.println(x+x+x);
    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void subtract(int a, int b){
        System.out.println(a-b);
    }

    public static int multiply(int a, int b){ // will only return an INT
        return(a*b); // sends c back to main method
    }
}
