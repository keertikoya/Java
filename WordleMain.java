// Keerti Koya
// Period 1
// 12/15/24

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.sql.SQLOutput;
import java.util.*;
import java.lang.Math;

public class WordleMain {
    public static void main(String[] args) {
        //this part of code will take all the words from the list and store it all in allWords
        ArrayList<String> allWords = new ArrayList<String>();
        try {
            File myObj = new File("/Users/keerti/Downloads/wordle.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                allWords.add(data);
            }
            myReader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }




        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Wordle! Try to guess the 5-letter word :)"); // introduces game
        System.out.println("Key:"); // key so users know what they're getting right and wrong
        System.out.println("G means right letter, right place");
        System.out.println("Y means right letter, wrong place");
        System.out.println("R means wrong letter");
        System.out.println("You have a total of 6 tries. Good luck!");

        int wordIndex = (int) (Math.random() * allWords.size()); // random index
        String actualWord = allWords.get(wordIndex).toLowerCase(); // picks a random word from the list
        WordleObject wordleObject = new WordleObject(actualWord.split(""));

        int tries = 6; // gets decremented
        boolean game = true; // runs until the user fully guesses the right word

        while (tries > 0 && game) { // runs while there are still tries left and game isn't over
            System.out.print("Guess a word: ");
            String guessedWord = scanner.nextLine(); // user inputted word

            if (guessedWord.equals(actualWord)) {
                game = false;
                System.out.println("Congrats! You guessed the word!");
            } else {
                check(actualWord, guessedWord);
                wordleObject.guessedLetter(guessedWord); // accesses guessedLetter method from WordleObject
                tries--; // decrements the number of tries
                System.out.println("Tries left: " + tries);
                System.out.println("Remaining letters: " + wordleObject.getAlphabet());
            }
        }

        if (tries == 0) { // if the user is out of tries and didn't win, print the word
            System.out.println("No more tries left! The word was: " + actualWord);
        }
    }

    public static void check(String actualWord, String guessedWord) {
        String output = ""; // used to add values to
        boolean[] actualWordUsed = new boolean[5]; // tracks letters already matched

        for (int i = 0; i < 5; i++) {
            if (actualWord.charAt(i) == guessedWord.charAt(i)) {
                output += "G"; // if it is the right letter in the right place
                actualWordUsed[i] = true;
            } else {
                output += "R"; // temporary if not the right letter in right place
            }
        }

        char[] outputArray = output.toCharArray();
        for (int i = 0; i < 5; i++) {
            if (outputArray[i] == 'R') {
                boolean matched = false; // checks if it is the right letter in wrong place
                for (int j = 0; j < 5 && !matched; j++) {
                    if (!actualWordUsed[j] && actualWord.charAt(j) == guessedWord.charAt(i)) {
                        outputArray[i] = 'Y'; // if so, change the R to a Y
                        actualWordUsed[j] = true;
                        matched = true;
                    }
                }
            }
        }

        output = new String(outputArray); // converts the array to a string
        System.out.println(output);
    }
}