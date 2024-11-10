public class FractionSimplify {
    public static void main(String[] args) {
        Fraction x = new Fraction(4,6);
        Fraction.simplify(x);
        System.out.println(x.getNum()); // prints 2
        System.out.println(x.getDen()); // prints 3
    }
}
