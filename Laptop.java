// Keerti Koya
// Period 1

public class Laptop extends Computer{
    // additional attribute
    private String chip;

    // constructor
    public Laptop(String b, String c, int m, String chip){
        super(b, c, m);
        this.chip = chip;
    }

    // method
    public boolean isFolded(){
        if (chip != "Apple M1"){
            return true;
        }
        return false;
    }
}
