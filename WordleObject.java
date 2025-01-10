// Keerti Koya
// Period 1
// 12/15/24

import java.util.*;

public class WordleObject {
    private String[] letters;  // size 5
    private ArrayList<String> alphabet;  // Alphabet for tracking unused letters

    public WordleObject(String[] letters) {
        this.letters = letters;
        alphabet = new ArrayList<String>();
        String[] x = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
                "x", "y", "z"};
        for (String temp : x)
            alphabet.add(temp); // adds every letter in alphabet to alphabet arraylist
    }

    public void guessedLetter(String guess) { // removes guessed letters from the alphabet
        for (int i = 0; i < guess.length(); i++) {
            String letter = String.valueOf(guess.charAt(i));
            alphabet.remove(letter);
        }
    }

    public ArrayList<String> getAlphabet() { // access alphabet
        return alphabet;
    }
}
