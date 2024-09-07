// Keerti Koya and Alisa Liao
// Period 1
// 9/6/24

import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        //Problem 1 (print 1-10)
        int x = 0;
        while(x < 10){
            x++;
            System.out.println(x);
        }

        for(int y = 1; y <= 10; y++){
            System.out.println(y);
        }

        // Problem 2 (sum of first 10 natural numbers)
        int a = 0;
        int total = 0;
        while(a < 10){
            a = a+1;
            total = total+a;
        }
        System.out.println("Your total is: " + total);

        int total2 = 0;
        for(int b = 1; b <= 10; b++){
            total2=total2+b;
        }
        System.out.println("Your total is: " + total2);

        
        // Problem 3 (multiplication table)
        int f = 0;
        int n = 1;
        System.out.println("Please enter a positive integer.");
        int input = inp.nextInt();
        inp.nextLine();
        while (n <= input) {
            while (f < input) {
                f = f + 1;
                System.out.print((n * f) + " ");
            }
            n = n + 1;
            f = 0;
            System.out.println();
        }


        // Problem 4 (calculate factorial)
        int factSum = 1;
        System.out.println("Enter a number to find the factorial of: ");
        int factorial = inp.nextInt();
        inp.nextLine();

        while (factorial > 0){
            factSum*=factorial; // multiplies sum by every number between 0 and inputted # inclusive
            factorial--;
        }
        System.out.println(factSum);


        // Problem 5 (calculate exponent)
        System.out.println("Enter your base number: "); // input base
        int base = inp.nextInt();
        inp.nextLine();

        System.out.println("Enter your exponent number: "); // input exponent
        int exponent = inp.nextInt();
        inp.nextLine();

        int powerSum = 1;

        while (exponent >0){ // set to power by multiplying
            powerSum *= base;
            exponent -= 1;
        }
        System.out.println("Your answer is: " + powerSum); // print final value


        // Problem 6 (reverse input digit)
        System.out.println("Input a number to reverse! ");
        int revNum = inp.nextInt();
        inp.nextLine();

        while (revNum > 0){
            System.out.print(revNum % 10); // takes last digit
            revNum /= 10; // updates x int without last digit
        }



        // Problem 7 (sum of odd integers)
        System.out.println("Enter a positive integer:");
        int oddInt = inp.nextInt();
        inp.nextLine();

        // using for loop
        int oddSum = 0;
        if (oddInt % 2 == 0){ // checks if even or odd
            oddInt--;
            for (int i = oddInt; i > 0; i-=2){ // decreases by 2
                oddSum+=i; // updates sum
            }
        }
        else {
            for (int i = oddInt; i > 0; i-=2){ // decreases by 2
                oddSum+=i; // updates sum
            }
        }
        System.out.println("The sum of all odd integers is: " + oddSum);

        // using while loop
        int oddSum2 = 0;
        if (oddInt % 2 == 0){ // checks if even of odd
            oddInt--;
            while (oddInt > 0){
                oddSum2+=oddInt; // updates sum
                oddInt-=2; // decreases by 2
            }
        }
        else {
            while (oddInt > 0){
                oddSum2+=oddInt; // updates sum
                oddInt-=2; // decreases by 2
            }
        }
        System.out.println("The sum of all odd integers is: " + oddSum2);


        // Problem 8 (checks if number is prime)
        System.out.println("Enter a positive integer: ");
        int prime = inp.nextInt();
        inp.nextLine();

        int check = prime-1; // makes sure the value itself isn't included
        int count = 0;
        while (check > 1){
            if (prime % check == 0){ // checks if input value is divisible by any value below it
                count++; // adds to counter if divisible
            }
            check--;
        }
        if (count > 0) // no brackets
            System.out.println("Your number is not prime.");
        else
            System.out.println("Your number is prime.");

    }
}
