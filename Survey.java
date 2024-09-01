// Keerti Koya
// Period 1
// 8/21/24

// 10 question survey with outputs including inputs (+ one math modification!)

import java.util.*;
public class Survey{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner input

        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("How old are you?");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("How many donuts did you eat yesterday?");
        int donutsDay1 = input.nextInt();
        input.nextLine();
        System.out.println("How many donuts have you eaten today?");
        int donutsDay2 = input.nextInt();
        input.nextLine();
        System.out.println("What's your dream vacation spot?");
        String vacation = input.nextLine();
        System.out.println("Is it true or false that you also like ice cream?");
        boolean iceCream = input.nextBoolean();
        input.nextLine();
        System.out.println("Regardless, what flavor do you like the most?");
        String iceCreamFlavor = input.nextLine();
        System.out.println("How many lollipops do you have with you right now?");
        double lollipops = input.nextDouble();
        input.nextLine();
        System.out.println("How many friends do you have?");
        double friends = input.nextDouble();
        input.nextLine();
        System.out.println("Is it true or false that you enjoyed this survey?");
        boolean enjoy = input.nextBoolean();
        input.nextLine();

        System.out.println(name + ", since you are " + age + " years old, you must have been born in " + (2024-age) + "!");
        System.out.print("You've eaten " + (donutsDay1 + donutsDay2) + " donuts already, slow down.");
        System.out.println("Although I'm sure you would enjoy eating them in " + vacation + ".");
        System.out.println("It is " + iceCream + " that you like ice cream. You like " + iceCreamFlavor + " a little more than the rest!");
        System.out.print("Be sure to share your " + lollipops + " lollipops with your " + friends + " friends.");
        System.out.println(" Give them each " + (lollipops/friends) + " lollipops!");
        System.out.println("It is " + enjoy + " that you enjoyed this survey. Thanks for taking it!");
    }
}
