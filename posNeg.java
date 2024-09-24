// Keerti Koya
// 9/24/24

import java.util.*;

public class posNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int firstNum = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your second number: ");
        int secondNum = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter \"false\" or \"true\" for the negative parameter: ");
        boolean fort = scanner.nextBoolean();

        System.out.println(check(firstNum, secondNum, fort));
    }

    public static boolean check (int a, int b, boolean negative){
        if (!negative)
            return (a > 0 && b < 0) || (a < 0 && b > 0);
        else
            return (a < 0 && b < 0);

    }
}

