public class MixedFraction extends Fraction{
    private int whole;

    public MixedFraction(){
        super(); // reference to parent class Shoe
        whole = 0;
    }

    public MixedFraction (int n, int d, int w){
        super(n, d);
        whole = w;
    }

    public int getNum() {
        return super.getNum();
    }

    public int getDen() {
        return super.getDen();
    }

    public int getWhole(){
        return whole;
    }

    public void setNum(int n) {
        super.setNum(n);
    }

    public void setDen(int d) {
        super.setDen(d);
    }

    public void setWhole(int whole) {
        this.whole = whole;
    }

    public Fraction convertImproperFraction() {
        int improperNumerator = whole * getDen() + getNum(); // calculate the numerator of the improper fraction
        return new Fraction(improperNumerator, getDen()); // return a Fraction object
    }

    public void simplify(MixedFraction m){
        Fraction x = convertImproperFraction();
        super.simplify(x);
        super.convertMixedFraction();
    }

    public String toString() {
        if (whole == 0 && getNum() != 0) {
            return getNum() + "/" + getDen(); // if there is no whole part, just return the proper fraction
        } else if (getNum() == 0) {
            return String.valueOf(whole); // if the numerator is 0, just return the whole number
        } else {
            return whole + " " + getNum() + "/" + getDen(); // otherwise, return the whole mixed fraction
        }
    }
}
