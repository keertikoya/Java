// Keerti Koya
// Period 1

public class Program {
    public static void main(String[] args) {
        // creating the objects
        Computer c1 = new Computer ("Dell", "Black", 16);
        Laptop l1 = new Laptop ("Apple", "Silver", 16, "Apple M1");
        SmartPhone s1 = new SmartPhone ("Google", "Pink", 16, true);

        // testing the methods
        c1.turnOn();
        c1.turnOff();

        l1.turnOn();
        l1.turnOff();
        l1.isFolded();

        s1.turnOn();
        s1.turnOff();
        s1.canJog();

        // print IDs
        System.out.println("Computer ID: " + c1.getID());
        System.out.println("Laptop ID: " + l1.getID());
        System.out.println("SmartPhone ID: " + s1.getID());

    }
}
