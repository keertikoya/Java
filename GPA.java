// Keerti Koya and Raina Wu
// Period 1
// 8/28/24

import java.util.*;

public class GPA {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String calc = "y";
        double sum = 0;

        System.out.println("This is a GPA Calculator where you'll enter grades for your 6 classes.");
        while (calc.equals("y")) { // condition
            int count = 1;
            while (count < 7){ // runs six times
                System.out.println("What grade did you get in period " + count + ". Please enter a capital letter.");
                String grade = inp.nextLine();
                if (grade.equals("A")){
                    sum += 4;
                }
                else if (grade.equals("B")){
                    sum += 3;
                }
                else if (grade.equals("C")){
                    sum += 2;
                }
                else if (grade.equals("D")){
                    sum += 1;
                }
                else{
                    sum += 0;
                }
                count ++;
            }
            System.out.println("Your GPA is " + (sum / 6)); // print final GPA
            System.out.println("Would you like to calculate another GPA? (y/n)");
            calc = inp.nextLine(); // changes value checked in condition
        }
    }
}
