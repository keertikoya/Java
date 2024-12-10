// Keerti Koya
// Period 1
// 11/4/24

public class Fraction{
    static int num;
    static int den;

    public Fraction(){
        num = 1;
        den = 1;
    }
    public Fraction(int n, int d){
        num = n;
        den = d;
    }

    public int getNum(){
        return num;
    }
    public int getDen(){
        return den;
    }

    public void setNum(int n){
        num = n;
    }
    public void setDen(int d){
        den = d;
    }

    public static void display(Fraction a){
        System.out.println(a.getNum() + "/" + a.getDen());
    }

    public static void simplify(Fraction a) {
        int common = gcf(a.getNum(), a.getDen()); // find the greatest common factor
        a.setNum(a.getNum() / common); // simplify numerator
        a.setDen(a.getDen() / common); // simplify denominator
    }

    public static int gcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // make sure the GCF is positive
    }

    public MixedFraction convertMixedFraction() {
        int whole = getNum() / getDen(); // calculate the whole number
        int newNumerator = getNum() % getDen(); // calculate the new numerator
        return new MixedFraction(newNumerator, getDen(), whole); // return a MixedFraction
    }
}