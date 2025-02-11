// testing BasketballPlayer methods

import java.util.ArrayList;

public class BasketballGame {
    public static void main(String[] args) {
        // arraylist of points scored in each game
        ArrayList<Integer> points = new ArrayList<Integer>();
        points.add(20);
        points.add(22);
        points.add(24);

        // arraylist of assists in each game
        ArrayList<Integer> assists = new ArrayList<Integer>();
        assists.add(4);
        assists.add(6);
        assists.add(8);

        // arraylist of rebounds in each game
        ArrayList<Integer> rebounds = new ArrayList<Integer>();
        rebounds.add(2);
        rebounds.add(3);
        rebounds.add(4);

        // create BasketballPlayer object
        BasketballPlayer jim = new BasketballPlayer(points, assists, rebounds, 3);


        System.out.println("points: " + jim.getPPG() + " / assists: " + jim.getAPG() + " / rebounds: " + jim.getRPG());
        // prints 22 6 3

        // test addGame method
        jim.addGame(27, 12, 1);
        System.out.println("points: " + jim.getPPG() + " / assists: " + jim.getAPG() + " / rebounds: " + jim.getRPG());
        // prints 23.25 7.5 2.5
    }
}
