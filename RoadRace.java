// Keerti Koya
// Period 1
// 11/19/24

import java.util.*;

public class RoadRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCompetitors = scanner.nextInt(); // first digit being inputted
        scanner.nextLine();

        Racer[] competitors = new Racer[numOfCompetitors]; // creates an array of Racer objects

        for (int i = 0; i < numOfCompetitors; i++) { // gets all the Racer info
            int t = scanner.nextInt();
            String s = scanner.next();
            Racer person = new Racer(t, s);
            competitors[i] = person;
        }

        overall(competitors, numOfCompetitors); // runs methods for finding all four values
        femaleWinner(competitors, numOfCompetitors);
        int maleWinnerTime = maleWinner(competitors, numOfCompetitors);
        maleSecondWinner(competitors, numOfCompetitors, maleWinnerTime);
    }

    public static void overall(Racer[] competitors, int numOfCompetitors) {
        int overallLeast = Integer.MAX_VALUE;
        for (int i = 0; i < numOfCompetitors; i++) {
            if (competitors[i].getTime() < overallLeast) {
                overallLeast = competitors[i].getTime(); // if this is the least time, then reassign the overallLeast variable value
            }
        }
        System.out.println(overallLeast); // overall winner
    }

    public static void femaleWinner(Racer[] competitors, int numOfCompetitors) {
        int femaleLeast = Integer.MAX_VALUE;
        for (int i = 0; i < numOfCompetitors; i++) {
            if (competitors[i].getSex().equals("F")) { // checks their sex
                if (competitors[i].getTime() < femaleLeast) {
                    femaleLeast = competitors[i].getTime(); // finds the least time value
                }
            }
        }
        System.out.println(femaleLeast); // prints fastest female time
    }

    public static int maleWinner(Racer[] competitors, int numOfCompetitors) {
        int maleLeast = Integer.MAX_VALUE;

        for (int i = 0; i < numOfCompetitors; i++) {
            if (competitors[i].getSex().equals("M")) { // checks their sex
                if (competitors[i].getTime() < maleLeast) {
                    maleLeast = competitors[i].getTime(); // finds the least time value
                }
            }
        }

        System.out.println(maleLeast); // prints fastest male time
        return maleLeast;
    }


    public static void maleSecondWinner(Racer[] competitors, int numOfCompetitors, int maleWinnerTime) {
        int maleSecondLeast = Integer.MAX_VALUE;

        for (int i = 0; i < numOfCompetitors; i++) {
            if (competitors[i].getSex().equals("M")) { // checks their sex
                if (competitors[i].getTime() > maleWinnerTime && competitors[i].getTime() < maleSecondLeast) { // compares it to the male winner time
                    maleSecondLeast = competitors[i].getTime(); // reassigns maleSecondLeast value
                }
            }
        }
        System.out.println(maleSecondLeast); // prints second male winner
    }

}