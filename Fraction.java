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
        int count = 100;
        int common = 0; // stores final common multiple
        while (count <= 100 && count > 0){
            if ((a.getNum() % count == 0) && (a.getDen() % count == 0)){ // check if both nums are divisible
                common = count;
                count = -5; // break loop

            }
            count -= 1;
        }
        num = (a.getNum() / common);
        den = (a.getDen() / common);
    }
}