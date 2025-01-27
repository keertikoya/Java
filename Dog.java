public class Dog extends Pet {
    private String size;
    private String breed;
    private int milesWalked;

    public Dog (String name, String gender, String size, String breed) {
        super(name, gender);
        this.size = size;
        this.breed = breed;
        this.milesWalked = 0;
    }

    // getters
    public String getSize() {
        return size;
    }

    public String getBreed() {
        return breed;
    }

    public int getMilesWalked() {
        return milesWalked;
    }

    // setters
    public void setSize(String size) {
        this.size = size;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // other
    public void addMilesWalked(int miles) { // finds new number of miles walked
        this.milesWalked += miles;
    }

    // toString method
    public String toString() {
        return super.toString() + ", Size: " + size + ", Breed: " + breed + ", Miles Walked: " + milesWalked;
    }
}






//        for (int i = numHeats + 1; i < data.length; i++) { // accesses race results
//            String race = data[i];
//            String[] results = race.split(" "); // splits race row by char
//            for (int position = 1; position < results.length; position++) {
//                int contestant = 0;
//                for (char c : results[position].toCharArray()) { // EDIT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//                    contestant = contestant * 10 + (c - '0'); // converts each ASCII char in digit to its int value
//                }
//                points[contestant] += position; // adds that number of points to the contestant's index in points array
//            }
//        }

//
//        // Create an array of contestants and their scores
//        int[][] contestants = new int[250][2];
//        int count = 0;
//        for (int i = 1; i < points.length; i++) {
//            if (points[i] > 0) {
//                contestants[count][0] = i; // Contestant number
//                contestants[count][1] = points[i]; // Total points
//                count++;
//            }
//        }
//
//        // Sort the contestants by score (ascending) and then by contestant number (ascending)
//        for (int i = 0; i < count - 1; i++) {
//            for (int j = i + 1; j < count; j++) {
//                if (contestants[i][1] > contestants[j][1] ||
//                        (contestants[i][1] == contestants[j][1] && contestants[i][0] > contestants[j][0])) {
//                    int[] temp = contestants[i];
//                    contestants[i] = contestants[j];
//                    contestants[j] = temp;
//                }
//            }
//        }
//
//        // Prepare the output for the top 5 places
//        String output = "";
//        int currentRank = 1;
//        for (int i = 0; i < count && currentRank <= 5; i++) {
//            if (i > 0 && contestants[i][1] > contestants[i - 1][1]) {
//                currentRank++;
//            }
//            if (currentRank > 5) {
//                break;
//            }
//
//            if (!output.endsWith("\n")) {
//                output += currentRank + " PLACE: " + contestants[i][0];
//            } else {
//                output += " " + contestants[i][0];
//            }
//
//            if (i + 1 == count || contestants[i][1] != contestants[i + 1][1]) {
//                output += "\n";
//            }
//        }
