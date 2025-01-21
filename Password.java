import java.util.ArrayList;
import java.util.Scanner;

public class Password {
    private String scrambledPassword;
    private ArrayList<Integer> scrambleIndices;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // to get user input

        // user creates password
        System.out.println("Create your password:");
        String entered1 = scanner.nextLine();
        Password account = new Password(entered1);

        // user can change password
        System.out.println("Change your password:");
        String entered2 = scanner.nextLine();
        account.changePassword(entered2);

        // user can verify a password
        System.out.println("Check your password:");
        String entered3 = scanner.nextLine();
        if (account.correctPassword(entered3)) {
            System.out.println("That is the correct password.");
        }
        else {
            System.out.println("That is the incorrect password.");
        }

    }

    public Password(String password) {
        if (checkPassword(password)) { // checks if the password inputted meets all reqs
            this.scrambledPassword = scramblePassword(password); // if so, save the scrambled password
            System.out.println("You successfully created your password!");
        }
        else { // otherwise, tell the user it's invalid
            System.out.println("Invalid password. Must contain at least 1 uppercase letter, 1 lowercase letter, 1 digit, 1 special character, and be at least 10 characters long.");
        }
    }

    private boolean checkPassword(String password) {
        if (password.length() < 10) return false; // password has to be greater than 10 chars long

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char ch : password.toCharArray()) { // iterate through each char in the password
            if (Character.isUpperCase(ch)) // checks if the char is upper case
                hasUpperCase = true; // if so, then that condition is met
            else if (Character.isLowerCase(ch)) // checks if the char is lower case
                hasLowerCase = true; // if so, then that condition is met
            else if (Character.isDigit(ch)) // checks if the char is a digit
                hasDigit = true; // if so, then that condition is met
            else if ("!@#$%^&*()_+-=[]{}|;:,.<>?".contains(String.valueOf(ch))) // checks if that char is a special value
                hasSpecialChar = true; // if so, then that condition is met

            if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar)
                return true; // if all conditions have been met, it is a valid password
        }
        return false;
    }

    private String scramblePassword(String password) {
        ArrayList<Integer> uniqueIndices = new ArrayList<>();

        while (uniqueIndices.size() < password.length()) { // generates unique random indices
            int randomIndex = (int) (Math.random() * password.length());
            if (!uniqueIndices.contains(randomIndex)) {
                uniqueIndices.add(randomIndex); // rearrange chars based on those indices
            }
        }

        System.out.print("indices: ");
        for (int i : uniqueIndices) {
            System.out.print(i);
        }
        System.out.println();

        StringBuilder scrambledPassword = new StringBuilder();
        for (int i : uniqueIndices) {
            char originalChar = password.charAt(i);
            char transformedChar = (char) (originalChar + 10 * i / 3); // Add a shift based on the index
            scrambledPassword.append(transformedChar);
        }

        System.out.println("scrambled password: " + scrambledPassword);
        return scrambledPassword.toString();
    }

    public boolean correctPassword(String input) {
        String scrambledInput = scramblePassword(input); // scramble the input and see if it matches the scrambled password stored
        return scrambledInput.equals(scrambledPassword);
    }

    public void changePassword(String newPassword) {
        if (checkPassword(newPassword)) {
            scrambledPassword = scramblePassword(newPassword); // resets password to inputted string
            System.out.println("Your password has been changed.");
        }
        else {
            System.out.println("That is an invalid password.");
        }
    }
}

