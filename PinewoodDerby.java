// Keerti Koya
// Period 1

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PinewoodDerby {
    public static void main(String[] args) {
        String sample = "";
        try {
            File myObj = new File("/Users/keerti/Downloads/PinewoodTest.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                sample += data + "\n";
            }
            myReader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        findWinners(sample); // print winners
    }

    public static void findWinners(String inputData) {
        String[] data = inputData.split("\\n"); // split input into rows

        int numHeats = (data.length - 1) / 2; // determine number of heats and contestants

        int[] points = new int[numHeats+1]; // space for every possible contestant given upper bound

        for (int i = 1; i <= numHeats; i++) {
            String[] contestants = data[i].split(" "); // split to access each contestant in the heat
            String[] placings = data[i + numHeats].split(" "); // split to access the result of each race

            for (int k = 0; k < contestants.length; k++) {
                int contestant = 0;
                for (char c : contestants[k].toCharArray()) { // convert the contestant string to int
                    if (c >= '0' && c <= '9') {
                        contestant = contestant * 10 + (c - '0');
                    }
                }

                int placing = 0;
                for (char c : placings[k].toCharArray()) { // convert the score into an int
                    if (c >= '0' && c <= '9') {
                        placing = placing * 10 + (c - '0');
                    }
                }

                points[contestant] += placing; // add the contestant's score to their corresponding index in the points array
            }
        }

        String output = "";

        for (int j = 0; j < 5; j++) { // finds lowest five elements in points array
            int min = Integer.MAX_VALUE;
            int[] tempIndices = new int[points.length];
            int count = 0;

            for (int i = 1; i < points.length; i++) { // starts from second element since first is 0
                if (points[i] < min) {
                    min = points[i];
                    tempIndices[0] = i + 1; // stores the index of the smallest value
                    count = 1;
                } else if (points[i] == min) {
                    tempIndices[count] = i + 1; // adds another index if there is a tie
                    count++;
                }
            }

            System.out.print((j + 1) + " PLACE WINNER: "); // outputs winner per place
            for (int k = 0; k < count; k++) {
                if (k > 0) System.out.print("    ");  // adds spaces between tied values
                System.out.print(tempIndices[k]-1);
            }
            System.out.println();

            for (int k = 0; k < count; k++) {
                int index = tempIndices[k] - 1;
                points[index] = Integer.MAX_VALUE; // sets the smallest values to a large number to avoid selecting them again
            }
        }
    }
}

