// Keerti Koya
// Period 1

public class Shoe {

    private int size; // always make them private for the AP exam!!
    private String color;
    private String brand;

    // CONSTRUCTORS
    // default constructor
    public Shoe(){
        size = 7;
        color = "white";
        brand = "Nike";
    }

    // customer constructor
    public Shoe(int s, String c, String b) {
        size = s;
        color = c;
        brand = b;
    }

    // GETTERS
    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return color;
    }

    // SETTERS
    public void setSize(int s) {
        size = s;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setBrand(String b) {
        brand = b;
    }

    // ArrayList<Shoe> shelf = new ArrayList<>();
    // Shoe shoeVar = new Shoe(7, "pink", "balenciaga");
    // shelf.add(shoeVar);
    // SAME AS
    // shelf.add (new Shoe(7, "pink", "balenciaga");


    // CUSTOM METHODS
    // methods in the object file that ONLY affect the attributes
    // "getters" and "setters" are custom methods as well


    public void increaseSize(){
        size++; // increases size value by 1
    }
    public void allBlack(){
        color = "black"; // changes color value to black
    }
    public void increaseAndBlack(){
        size++;
        color = "black"; // changes the value of both size and color

        // SAME AS

        increaseSize();
        allBlack();
    }

    public void stuff1(){
        System.out.println("I am Shoe's stuff1");
    }
    public void stuff2(){
        System.out.println("I am Shoe's stuff2");
    }
}


