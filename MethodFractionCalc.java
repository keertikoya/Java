// Keerti Koya
// Period 1
// 10/29/24

import java.util.*;

public class MethodFractionCalc {
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

            int[] finalFrac = new int[2]; // final fraction that will be later passed to display method

            int[] frac1 = new int[2]; // first fraction
            int[] frac2 = new int[2]; // second fraction

            if (operation >= 0 && operation <=4){

                System.out.println("Please enter the numerator of your first fraction:");
                frac1[0] = scanner.nextInt(); // get user inputted numerator of first fraction
                scanner.nextLine();
                System.out.println("Please enter the denominator of your first fraction:");
                frac1[1] = scanner.nextInt(); // get user inputted denominator of first fraction
                scanner.nextLine();
                System.out.println("Please enter the numerator of your first fraction:");
                frac2[0] = scanner.nextInt(); // get user inputted numerator of second fraction
                scanner.nextLine();
                System.out.println("Please enter the denominator of your second fraction:");
                frac2[1] = scanner.nextInt(); // get user inputted denominator of second fraction
                scanner.nextLine();

                if (operation == 1){ // addition
                    finalFrac = simplify(add(frac1,frac2));
                }
                else if (operation == 2){ // subtraction
                    finalFrac = simplify(subtract(frac1,frac2));
                }
                else if (operation == 3){ // multiplication
                    finalFrac = simplify(multiply(frac1,frac2));
                }
                else{ // division
                    finalFrac = simplify(divide(frac1,frac2));
                }
            }
            else { // if the user only wants to simplify a fraction, they only need to input one fraction
                System.out.println("Please enter the numerator of your fraction:");
                finalFrac[0] = scanner.nextInt(); // get user inputted numerator of first fraction
                scanner.nextLine();
                System.out.println("Please enter the denominator of your fraction:");
                finalFrac[1] = scanner.nextInt(); // get user inputted denominator of first fraction
                scanner.nextLine();
                finalFrac = simplify(finalFrac); // passes num and denom to simplify function
            }

            displayAnswer(finalFrac); // displays final fraction

            System.out.println("Do you want to reenter an operation? (y/n)");
            run = scanner.nextLine(); // updates variable the while loop checks
        }
    }

    public static int[] add( int[]a, int b[]){
        int[] finalFrac = new int[2];
        finalFrac[0] = (a[0] * b[1]) + (b[0] * a[1]); // adds the numerators with a common denom
        finalFrac[1] = a[1] * b[1]; // creates a common denominator
        return finalFrac;
    }

    public static int[] subtract( int[]a, int b[]){
        int[] finalFrac = new int[2];
        finalFrac[0] = (a[0] * b[1]) - (b[0] * a[1]); // subtracts the numerators with a common denom
        finalFrac[1] = a[1] * b[1]; // creates a common denominator
        return finalFrac;
    }
    public static int[] multiply( int[]a, int b[]){
        int[] finalFrac = new int[2];
        finalFrac[0] = a[0] * b[0]; // multiplies numerators
        finalFrac[1] = a[1] * b[1]; // multiplies denominators
        return finalFrac;
    }
    public static int[] divide( int[]a, int b[]){
        int[] finalFrac = new int[2];
        finalFrac[0] = a[0] * b[1]; // multiplies first num with second denom (flips fraction)
        finalFrac[1] = a[1] * b[0]; // multiplies first denom with second num (flips fraction)
        return finalFrac;
    }
    public static int[] simplify( int[] a) {
        int count = 100;
        int common = 0; // stores final common multiple
        while (count <= 100 && count > 0){
            if ((a[0] % count == 0) && (a[1] % count == 0)){ // check if both nums are divisible
                common = count;
                count = -5; // break loop

            }
            count -= 1;
        }
        a[0] = (a[0] / common);
        a[1] = (a[1] / common);
        int[] newArr = {a[0], a[1]};
        return newArr;
    }

    public static void displayAnswer( int[] a){
        System.out.println(a[0] + "/" + a[1]);  // displays final fraction
    }
}
