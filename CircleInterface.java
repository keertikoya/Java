// Keerti Koya
// Period 1

public class CircleInterface implements Shape{
    private double radius;

    public CircleInterface(double radius) {
        this.radius = radius;
    }

    public String thisIsA() {
        return "Circle"; // returns name of shape
    }

    public double getArea() {
        return Math.PI * radius * radius; // returns area = pi * r^2
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius; // returns circumference = 2 * pi * r
    }

    public double getVolumeOfCone(int height) {
        return (1.0 / 3.0) * getArea() * height; // returns cone volume = (1/3) * base area * height
    }

    public double shortestSide() {
        return 2 * radius; // no real "smallest side" for a circle so will print diameter
    }

    public double dilatedArea(int k) {
        return Math.PI * (radius * k) * (radius * k); // dilates the shape / scales the area by a factor k
    }

    public String toString() {
        return "You have a circle shape of radius " + radius;
    }

    public static void main(String[] args) {
        CircleInterface circle = new CircleInterface(5);
        System.out.println(circle.thisIsA());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Volume of cone: " + circle.getVolumeOfCone(7));
        System.out.println("Shortest side: " + circle.shortestSide());
        System.out.println("Dilated area: " + circle.dilatedArea(3));
        System.out.println(circle);
    }
}
