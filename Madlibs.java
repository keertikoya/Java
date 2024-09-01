// Keerti Koya
// Period 1
// 8/22/24

import java.util.*;

public class Madlibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // getting inputs
        System.out.print("Enter an adjective: ");
        String adjective1 = scanner.nextLine();

        System.out.print("Enter a noun: ");
        String noun1 = scanner.nextLine();

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        System.out.print("Enter another noun: ");
        String noun2 = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective2 = scanner.nextLine();

        System.out.print("Enter another noun: ");
        String noun3 = scanner.nextLine();

        System.out.print("Enter a city name: ");
        String cityName = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective3 = scanner.nextLine();

        System.out.print("Enter an animal: ");
        String animal = scanner.nextLine();

        System.out.print("Enter a language: ");
        String language = scanner.nextLine();

        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter a noun (plural): ");
        String monsterPlural = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective4 = scanner.nextLine();

        System.out.print("Enter an object: ");
        String object1 = scanner.nextLine();

        System.out.print("Enter a number of miles: ");
        int miles = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective5 = scanner.nextLine();

        System.out.print("Enter another noun: ");
        String noun4 = scanner.nextLine();

        System.out.print("Enter height in feet: ");
        double height = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter a color: ");
        String color = scanner.nextLine();

        System.out.print("Enter a noun (plural): ");
        String nounPlural2 = scanner.nextLine();

        System.out.print("Enter a number in dollars: ");
        double dollars = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter a percentage: ");
        double percentage = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter a number: ");
        int timeUnit = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter a number of friends: ");
        int number2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter a food: ");
        String food = scanner.nextLine();

        System.out.print("Enter a drink: ");
        String drink = scanner.nextLine();

        System.out.print("Enter a genre of music: ");
        String musicGenre = scanner.nextLine();

        System.out.print("Enter a time of day: ");
        String timeOfDay = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter another object: ");
        String object2 = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective6 = scanner.nextLine();

        System.out.print("Enter the last noun: ");
        String trueLesson = scanner.nextLine();

        // printing the story
        System.out.println("\nThe Mysterious Adventure\n");
        System.out.println("One day, a " + adjective1 + " " + noun1 + " named " + name + " decided to embark on an adventure to find the legendary " + noun2 + ".");
        System.out.println("Armed with a " + adjective2 + " " + noun3 + ", they set out from their home in " + cityName + ".");
        System.out.println("As they traveled, they encountered a " + adjective3 + " " + animal + " that could speak " + language + ".");
        System.out.println("The animal warned them about the " + number1 + " " + monsterPlural + " that guarded the treasure.");
        System.out.println("Undeterred, " + name + " continued, but not before the animal gave them a " + adjective4 + " " + object1 + ".");
        System.out.println("After walking " + miles + " miles, they reached the " + adjective5 + " " + noun4 + " where the treasure was hidden.");
        System.out.println("The " + monsterPlural + " were there, just as the animal had warned. However, there were " + (number1 * 2) + " yams. " + "Each one was " + height + " feet tall and weighed " + weight + " pounds.");
        System.out.println("To distract them, " + name + " tossed the " + object1 + " at them, which exploded into " + color + " " + nounPlural2 + ".");
        System.out.println("The " + monsterPlural + " were so surprised that they forgot to guard the treasure.");
        System.out.println("With the path clear, " + name + " walked up to the " + noun4 + " and found the legendary " + noun2 + " inside.");
        System.out.println("It was worth $" + dollars + ", and its value would increase by " + percentage + "% every " + timeUnit + " days.");
        System.out.println("Feeling victorious, " + name + " returned home and shared the story with " + number2 + " friends over a meal of " + food + " and " + drink + ".");
        System.out.println("They all celebrated by dancing to " + musicGenre + " until " + timeOfDay + ".");
        System.out.println("But as the night ended, " + name + " realized they had forgotten to " + verb + " the " + monsterPlural + ", which caused it to turn into " + object2 + ".");
        System.out.println("With a sigh, they promised themselves that next time, they'd be more careful with " + adjective6 + " treasures.");
        System.out.println("In the end, they learned that the real treasure was the " + trueLesson + " they made along the way.");
    }
}
