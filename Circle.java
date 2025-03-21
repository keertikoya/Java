public class Circle extends Shapes {
    private double radius;

    // constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // override calculateArea() method in Shapes
    public double calculateArea() {
        return Math.PI * radius * radius; // area = πr^2
    }

    public double getRadius() {
        return radius;
    }
}
