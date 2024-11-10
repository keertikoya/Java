// Keerti Koya
// Period 1
// 11/4/24

import java.util.*;

public class FractionCalc3 {

    static int finalNum;
    static int finalDen;

    static Fraction finalFrac;

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

            int num1; // first fraction
            int den1;
            int num2;
            int den2;

            if (operation >= 0 && operation <=4){

                System.out.println("Please enter the numerator of your first fraction:");
                num1 = scanner.nextInt(); // get user inputted numerator of first fraction
                scanner.nextLine();
                System.out.println("Please enter the denominator of your first fraction:");
                den1 = scanner.nextInt(); // get user inputted denominator of first fraction
                scanner.nextLine();
                System.out.println("Please enter the numerator of your second fraction:");
                num2 = scanner.nextInt(); // get user inputted numerator of second fraction
                scanner.nextLine();
                System.out.println("Please enter the denominator of your second fraction:");
                den2 = scanner.nextInt(); // get user inputted denominator of second fraction
                scanner.nextLine();

                Fraction x = new Fraction(num1, den1);
                Fraction y = new Fraction(num2, den2);

                if (operation == 1){ // addition
                    finalFrac = simplify(add(x,y));
                }
                else if (operation == 2){ // subtraction
                    finalFrac = simplify(sub(x,y));
                }
                else if (operation == 3){ // multiplication
                    finalFrac = simplify(mult(x,y));
                }
                else{ // division
                    finalFrac = simplify(div(x,y));
                }
            }
            else { // if the user only wants to simplify a fraction, they only need to input one fraction
                System.out.println("Please enter the numerator of your fraction:");
                num1 = scanner.nextInt(); // get user inputted numerator of first fraction
                scanner.nextLine();
                System.out.println("Please enter the denominator of your fraction:");
                den1 = scanner.nextInt(); // get user inputted denominator of first fraction
                scanner.nextLine();

                Fraction z = new Fraction(num1, den1);

                finalFrac = simplify(finalFrac); // passes num and denom to simplify function
            }

            Fraction.display(finalFrac); // displays final fraction

            System.out.println("Do you want to reenter an operation? (y/n)");
            run = scanner.nextLine(); // updates variable the while loop checks
        }
    }

    public static Fraction add(Fraction a, Fraction b) {
        finalNum = (a.getNum() * b.getDen()) + (b.getNum() * a.getDen()); // adds the numerators with a common denom
        finalDen = a.getDen() * b.getDen(); // creates a common denominator
        finalFrac = new Fraction(finalNum, finalDen);
        finalFrac = simplify(finalFrac);
        return finalFrac;
    }

    public static Fraction sub(Fraction a, Fraction b) {
        finalNum = (a.getNum() * b.getDen()) - (b.getNum() * a.getDen()); // subtracts the numerators with a common denom
        finalDen = a.getDen() * b.getDen(); // creates a common denominator
        finalFrac = new Fraction(finalNum, finalDen);
        finalFrac = simplify(finalFrac);
        return finalFrac;
    }

    public static Fraction mult(Fraction a, Fraction b) {
        finalNum = a.getNum() * b.getNum(); // multiplies numerators
        finalDen = a.getDen() * b.getDen(); // multiplies denominators
        finalFrac = new Fraction(finalNum, finalDen);
        finalFrac = simplify(finalFrac);
        return finalFrac;
    }

    public static Fraction div(Fraction a, Fraction b) {
        finalNum = a.getNum() * b.getDen(); // multiplies first num with second denom (flips fraction)
        finalDen = a.getDen() * b.getNum(); // multiplies first denom with second num (flips fraction)
        finalFrac = new Fraction(finalNum, finalDen);
        finalFrac = simplify(finalFrac);
        return finalFrac;
    }

    public static Fraction simplify(Fraction a) {
        int count = 100;
        int common = 0; // stores final common multiple
        while (count <= 100 && count > 0){
            if ((a.getNum() % count == 0) && (a.getDen() % count == 0)){ // check if both nums are divisible
                common = count;
                count = -5; // break loop

            }
            count -= 1;
        }
        finalNum = (a.getNum() / common);
        finalDen = (a.getDen() / common);
        finalFrac = new Fraction(finalNum, finalDen);
        return finalFrac;
    }
}