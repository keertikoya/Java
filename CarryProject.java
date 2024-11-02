// Keerti Koya
// Period 1
// 10/28/24

import java.util.*;
import java.util.ArrayList;

public class CarryProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();

        System.out.print("How many digits are in your first number? ");
        int digits = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the digits, each on a new line: ");
        for (int i = 0; i < digits; i++) {
            num1.add(scanner.nextInt()); // adds each inputted digit into num1 arraylist
            scanner.nextLine();
        }

        System.out.print("How many digits are in your second number? ");
        digits = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the digits, each on a new line: ");
        for (int i = 0; i < digits; i++) {
            num2.add(scanner.nextInt()); // adds each inputted digit into num2 arraylist
            scanner.nextLine();
        }

        while (num1.size() < num2.size()) { // makes both arrays the same size
            num1.add(0, 0);
        }
        while (num2.size() < num1.size()) { // makes both arrays the same size
            num2.add(0, 0);
        }

        display(add(num1, num2)); // finds sum first and then passes to display method
    }

    public static ArrayList<Integer> add(ArrayList<Integer> base, ArrayList<Integer> other) {
        int carry = 0; // value to be carried
        int baseIndex = base.size() - 1;
        int otherIndex = other.size() - 1;

        while (baseIndex >= 0 || otherIndex >= 0 || carry != 0) { // runs while in index bounds
            int baseDigit = 0;
            int otherDigit = 0;
            if (baseIndex >= 0) {
                baseDigit = base.get(baseIndex); // sets value for base array digit
            }
            if (otherIndex >= 0) {
                otherDigit = other.get(otherIndex); // sets value for other array digit
            }

            int digitSum = baseDigit + otherDigit + carry;
            carry = digitSum / 10;

            if (baseIndex >= 0) {
                base.set(baseIndex, digitSum % 10); // sets to be ones place digit
            } else {
                base.add(0, digitSum % 10); // adds ones place digit
            }

            baseIndex--; // moves to next digit
            otherIndex--;
        }
        return base; // returns sum array
    }

    public static void display(ArrayList<Integer> sum){
        String result = ""; // the string that will be printed
        int count = 0;

        for (int i = 0; i < sum.size(); i++) {
            result += sum.get(i);
            count++;

            if ((sum.size() - count) % 3 == 0 && i != sum.size() - 1) {
                result += ","; // adding a comma after every 3 digits
            }
        }
        System.out.println(result); // final printed value
    }
}
