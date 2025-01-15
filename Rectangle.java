public class Rectangle extends Shapes{
    private double length;
    private double width;

    // constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // override calculateArea() method in Shapes
    public double calculateArea(){
        return length * width; // area = l * w
    }
}
