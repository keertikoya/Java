// Keerti Koya
// Period 1
// 11/16/24

import java.util.*;

public class Card {
        String suit;
        int value;
        String name;

        public Card(String s, int v, String n){
            suit = s;
            value = v;
            name = n;
        }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " of " + suit;
    }
}
