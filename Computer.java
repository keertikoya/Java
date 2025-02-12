// Keerti Koya
// Period 1

public class Computer extends AbstractEntity{
    // 3 attributes
    private String brand;
    private String color;
    private int memory;

    // constructor
    public Computer(String b, String c, int m){
        brand = b;
        color = c;
        memory = m;
    }

    // 2 other methods
    public void turnOn() {
        System.out.println("The " + color + " " + brand + " is powering on.");
    }

    public void turnOff() {
        System.out.println("The " + color + " " + brand + " is shutting down.");
    }
}
