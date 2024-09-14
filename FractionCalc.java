// Keerti Koya
// Period 1
// 9/16/24

import java.util.*;

public class FractionCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creates a scanner
        System.out.println("Welcome to the fraction calculator!");

        String run = "y";

        while (run.equals("y")){
            System.out.println("Please enter the number of your operation:\n" +
                    "(1) Addition\n" +
                    "(2) Subtraction\n" +
                    "(3) Multiplication\n" +
                    "(4) Division\n" +
                    "(5) Simplify a fraction");

            int operation = scanner.nextInt(); // get user inputted operation number
            scanner.nextLine();

            int finalNum;
            int finalDen;

            if (operation > 0 && operation <= 4){
                System.out.println("Please enter the numerator of your first fraction:");
                int num1 = scanner.nextInt(); // get user inputted numerator of first fraction
                scanner.nextLine();
                System.out.println("Please enter the denominator of your first fraction:");
                int den1 = scanner.nextInt(); // get user inputted denominator of first fraction
                scanner.nextLine();
                System.out.println("Please enter the numerator of your first fraction:");
                int num2 = scanner.nextInt(); // get user inputted numerator of second fraction
                scanner.nextLine();
                System.out.println("Please enter the numerator of your first fraction:");
                int den2 = scanner.nextInt(); // get user inputted denominator of second fraction
                scanner.nextLine();

                if (operation == 1){
                    finalNum = (num1 * den2) + (num2 * den1); // adds the numerators with a common denom
                    finalDen = den1 * den2; // creates a common denominator
                }
                else if (operation == 2){
                    finalNum = (num1 * den2) - (num2 * den1); // subtracts the numerators with a common denom
                    finalDen = den1 * den2; // creates a common denominator
                }
                else if (operation == 3){
                    finalNum = num1 * num2; // multiplies numerators
                    finalDen = den1 * den2; // multiplies denominators
                }
                else { // operation must equal 4 (otherwise it would not have entered the if statement)
                    finalNum = num1 * den2; // multiplies first num with second denom (flips fraction)
                    finalDen = den1 * num2; // multiplies first denom with second num (flips fraction)
                }
            }
            else {
                System.out.println("Please enter the numerator of your fraction:");
                finalNum = scanner.nextInt(); // get user inputted numerator of first fraction
                scanner.nextLine();
                System.out.println("Please enter the denominator of your fraction:");
                finalDen = scanner.nextInt(); // get user inputted denominator of first fraction
                scanner.nextLine();
            }

            int count = 100;
            int common = 0; // stores final common multiple
            while (count <= 100 && count > 0){
                if ((finalNum % count == 0) && (finalDen % count == 0)){ // check if both nums are divisible
                    common = count;
                    count = -5; // break loop

                }
                count -= 1;
            }
            System.out.println((finalNum / common) + "/" + (finalDen / common)); // prints final simplified fraction

            System.out.println("Do you want to reenter an operation? (y/n)");
            run = scanner.nextLine(); // updates variable the while loop checks
        }
    }
}
