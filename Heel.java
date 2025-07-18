public class Heel extends Shoe{
    // ATTRIBUTES
        // has size, color, brand already
    private int height; // adds height attribute

    // CONSTRUCTORS

    // default
    public Heel(){
        super(); // reference to parent class Shoe
        height = 3;
    }

    // custom
    public Heel (int s, String c, String b, int h){
        super(s, c, b);
        height = h;
    }

    // GETTERS

    public int getHeight(){
        return height;
    }
    // SETTERS


    // toString
    // custom methods

    public void stuff1(){
        System.out.println("I am Heel's stuff1");
    }
    public void stuff2(){
        System.out.println("I am Heel's stuff2");
    }
}
