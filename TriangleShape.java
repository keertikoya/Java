public class TriangleShape extends Shapes{
    private double base;
    private double height;

    // constructor
    public TriangleShape(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // override calculateArea() method in Shapes
    public double calculateArea(){
        return (base * height)/2; // area = b * h * 0.5
    }
}
