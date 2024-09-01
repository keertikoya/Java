import java.util.*;

public class Variables {
    public static void main(String[] args) {

        // VARIABLES
        int x;
        x = 5;

        int y = 5;

        System.out.println(x); // prints 5
        x = 7;
        System.out.println(x); // prints 7

        x = 8+9;
        x = 10-4;
        x = 4 * 5;
        x = 10 / 3; // truncates to 3
        System.out.println("division: " + x);

        int z = 10 % 3; // % is the remainder
        System.out.println("modulus: " + z);

        System.out.println(10.0 / 3.0); // division with double gives full number

        System.out.println(3+4*5); // PEMDAS
        System.out.println((3+4)*5);

        // SCANNER INPUT

        Scanner input = new Scanner (System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("What is your age?");
        int age = input.nextInt();
        input.nextLine(); // MUST PROCEED nextInt(), nextDouble(), or nextBoolean()
        System.out.println("Hi " + name + "!");
        System.out.println("You are " + age + " years old.");
    }
}
