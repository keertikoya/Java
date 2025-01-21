// Keerti Koya
// Period 1

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Scramble {
    public static void main(String[] args) {
        String password = "hello"; // og password
        System.out.println("password length: " + password.length());

        ArrayList<Integer> uniqueIndices = new ArrayList<>();

        int randomIndex = (int) (Math.random() * password.length()); // unique random index for the first position
        uniqueIndices.add(randomIndex); // add first index

        while (uniqueIndices.size() < password.length()) {
            randomIndex = (int) (Math.random() * password.length()); // other random indices not used before
            if (!uniqueIndices.contains(randomIndex)) {
                uniqueIndices.add(randomIndex);
            }
        }

        System.out.print("indices: ");
        for (int i : uniqueIndices){
            System.out.print(i);
        }
        System.out.println();

        String scrambledPassword = ""; // empty string for the scrambled password
        char[] letters = new char[password.length()];
        int index = 0;
        for (int i = 0; i < password.length(); i++) {
            letters[i] = password.charAt(index);
            index++;
            //scrambledPassword += password.charAt(index); // add chars to string
        }

        System.out.println("scrambled password: " + scrambledPassword); // print scrambled password

        System.out.println(unscramble(uniqueIndices, letters, password));
    }


    private static String unscramble (ArrayList<Integer> places, char [] symbols, String pwd)
    {
        List<Character> unscramble = new ArrayList <>();
        int originalindex;
        originalindex = 0;
        for (int i = 0; i < pwd.length() - symbols.length; i++)
        {
            if (places.get(i)!=i)
            {
                unscramble.set(originalindex++, pwd.charAt(i));
            }
        }
        for (int i = 0; i < pwd.length() - symbols.length; i++)
        {
            unscramble.add(' ');
        }
        for (int i = 0; i < pwd.length() - places.size(); i++ )
        {
            int position = places.get(i);
            unscramble.set(position, pwd.charAt(i));
        }
        String unscramble2;
        unscramble2 = "";
        for (char x: unscramble)
        {
            unscramble2 += x;
        }
        return unscramble2;

    }

    public void changePassword (String password) {
        if (password.length() < 10) {
            System.out.println("Password must be at least 10 characters long.");
        }

        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean specialChar = false;

        String upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseChars = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        for (int i = 0; i < password.length(); i++) {
            String currentChar = password.substring(i, i + 1);
            for (int j = 0; j < upperCaseChars.length(); j++) {
                if (currentChar.equals(upperCaseChars.substring(j, j + 1))) {
                    upperCase = true;
                    j = upperCaseChars.length();
                }
            }
            for (int k = 0; k < lowerCaseChars.length(); k++) {
                if (currentChar.equals(lowerCaseChars.substring(k, k + 1))) {
                    lowerCase = true;
                    k = lowerCaseChars.length();
                }
            }
            for (int l = 0; l < digits.length(); l++) {
                if (currentChar.equals(digits.substring(l, l + 1))) {
                    digit = true;
                    l = digits.length();
                }
            }
            for (int m = 0; m < specialChars.length(); m++) {
                if (currentChar.equals(specialChars.substring(m, m + 1))) {
                    specialChar = true;
                    m = specialChars.length();
                }
            }
        }

        if (upperCase && lowerCase && digit && specialChar) {
            System.out.println("Password successfully changed.");
            //this.password = password;
        }
        else {
            System.out.println("Password must contain at least one uppercase letter, one lowercase letter, one digit, and one special character.");
        }
    }
}