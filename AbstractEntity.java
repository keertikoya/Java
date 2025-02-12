// Keerti Koya
// Period 1

import java.util.ArrayList;

abstract class AbstractEntity {
    private ArrayList<Integer> createdIds = new ArrayList<>(); // used to ensure the new ID is unique
    private int ID;

    // constructor
    public AbstractEntity() {
        int newID = 10000000 + (int) (Math.random() * 90000000);
        boolean check = true;
        while (check){ // runs until the ID created is unique
            newID = 10000000 + (int) (Math.random() * 90000000);
            if (createdIds.contains(newID) != true){
                check = false;
            }
        }
        ID = newID;
    }

    public int getID() {
        return ID;
    }
}
