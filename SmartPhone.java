// Keerti Koya
// Period 1

public class SmartPhone extends Computer {
    // additional attribute
    private boolean fitsInPocket;

    // constructor
    public SmartPhone (String b, String c, int m, boolean f){
        super(b, c, m);
        fitsInPocket = f;
    }

    // method
    public void canJog() {
        if (fitsInPocket){
            System.out.println("You can jog with your smartphone!");
        }
        else{
            System.out.println("You canNOT jog with your smartphone!");
        }
    }
}
