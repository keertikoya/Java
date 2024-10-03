// Keerti Koya
// 10/1/24

import java.util.*;

public class BirthdayDB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true; // check to see if program should continue running
        String[] name = new String[0]; // creates empty arrays for each variable
        String[] month = new String[0];
        int[] day = new int[0];
        int[] year = new int[0];

        while (run) { // continues running until run is false
            System.out.println("What option would you like to choose (1. add student, 2. remove student, " +
                    "3. student by year, 4. student by month, 5. students in a range, 6. QUIT)?");
            System.out.println("length: " + name.length);
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) { // adding a student
                System.out.println("Enter the student's information in this order (name, month, day, year).");
                name = stringAdd(scanner, name);
                month = stringAdd(scanner, month);
                day = intAdd(scanner, day);
                year = intAdd(scanner, year);

            }
            else if (choice == 2 && name.length != 0) { // removing a student
                for (int i = 0; i < name.length; i++) {
                    System.out.println((i + 1) + " " + name[i]);
                }
                System.out.println("Which student would you like to remove?");
                int remIndex = scanner.nextInt();
                scanner.nextLine();
                name = stringRemove(name, remIndex);
                month = stringRemove(month, remIndex);
                day = intRemove(day, remIndex);
                year = intRemove(year, remIndex);
            }
            else if (choice == 3 && name.length != 0) { // check students born in a year
                System.out.println("Which year would you like to check?");
                int check = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Students born in that year: ");
                for (int i = 0; i < name.length; i++) {
                    if (year[i] == check) {
                        System.out.println(name[i] + " ");
                    }
                }
            }
            else if (choice == 4 && name.length != 0) { // check students born in a month
                System.out.println("Which month would you like to check?");
                String check = scanner.nextLine();
                System.out.print("Students born in that month: ");
                for (int i = 0; i < name.length; i++) {
                    if (month[i].equals(check)) {
                        System.out.println(name[i] + " ");
                    }
                }
            }
            else if (choice == 5 && name.length != 0) { // check students born in a range
                System.out.println("Input the earlier year (number):"); // gets the lower day value
                int year1 = scanner.nextInt();
                System.out.println("Input the earlier month (number):");
                int month1 = scanner.nextInt();
                System.out.println("Input the earlier day (number):");
                int day1 = scanner.nextInt();
                int dayOne = changeDate(scanner, year1, month1, day1);

                System.out.println("Input the later year (number):"); // gets the higher day value
                int year2 = scanner.nextInt();
                System.out.println("Input the earlier month (number):");
                int month2 = scanner.nextInt();
                System.out.println("Input the earlier day (number):");
                int day2 = scanner.nextInt();
                int dayTwo = changeDate(scanner, year2, month2, day2);

                System.out.println("The students in that range: ");

                for (int i = 0; i < name.length; i++) { // checks the students in that range
                    int check = changeDate(scanner, year[i], monthToNum(month[i]), day[i]);
                    if (check < dayTwo && check > dayOne) {
                        System.out.println(name[i]);
                    }
                }
            }
            else if (choice == 6) { // quit running
                run = false;
            }
            else { // incorrect input
                System.out.println("Error! Either a number that is not an option was entered or " +
                        "there are currently no students in the database.");
            }
        }
    }

    public static String[] stringAdd(Scanner scanner, String[] arr) {
        String value = scanner.nextLine();
        String[] temp = new String[arr.length + 1]; // creates a new array with size 1 greater than passed array
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i]; // adds all previous values to new temp array
        }
        temp[temp.length - 1] = value; // adds new value in
        return temp; // returns updated array to main method
    }

    public static int[] intAdd(Scanner scanner, int[] arr) {
        int value = scanner.nextInt();
        scanner.nextLine();
        int[] temp = new int[arr.length + 1]; // creates a new array with size 1 greater than passed array
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i]; // adds all previous values to new temp array
        }
        temp[temp.length - 1] = value; // adds new value in
        return temp; // returns updated array to main method
    }

    public static String[] stringRemove(String[] arr, int index) {
        String[] temp = new String[arr.length - 1]; // creates a new array with size 1 less than passed array
        for (int i = 0; i < arr.length; i++) {
            if (temp[i] != null) { // inputs all elements of passed array into new array besides element chosen to remove
                temp[i] = arr[i];
            } else {
                i++; // skips the element chosen to remove
            }
        }
        return temp; // returns updated array
    }

    public static int[] intRemove(int[] arr, int index) {
        int[] temp = new int[arr.length - 1]; // creates a new array with size 1 less than passed array
        for (int i = 0; i < arr.length; i++) {
            if (temp[i] != 0) { // inputs all elements of passed array into new array besides element chosen to remove
                temp[i] = arr[i];
            } else {
                i++; // skips the element chosen to remove
            }
        }
        return temp; // returns updated array
    }

    public static int changeDate(Scanner scanner, int year, int month, int day) {
        // changes the date into integer yearmonthday format
        int total = 0;

        total += year;
        total *= 100;

        total += month;
        total *= 100;

        total += day;
        total *= 100;

        return total;
    }

    public static int monthToNum(String month) {
        // converts string months to integer values for use in changeDate method
        String[] monthList = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        for (int i = 0; i < 12; i++) {
            if (month.equals(monthList[i])) {
                return (i + 1); // month's number is 1 greater than its index in the array
            }
        }
        return (-1); // shouldn't reach here if the user correctly inputs month
    }
}
