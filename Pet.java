// Keerti Koya
// Period 1

public class Pet {
    private String name;
    private String gender;
    private boolean hungry;
    private int hungerCounter;

    public Pet (String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.hungry = false;
        this.hungerCounter = 15; // full at the start
    }

    // getters
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // other
    public boolean isHungry() { // determine whether or not they're hungry
        return hungry;
    }

    public void feed() { // once they're fed, they're back up to the og hunger count
        hungry = false;
        hungerCounter = 15;
    }

    public void decrementHungerCounter() { // should be called after every operation
        hungerCounter--;
        if (hungerCounter <= 0) {
            hungry = true;
        }
    }

    // toString method
    public String toString() {
        return "Name: " + name + ", Gender: " + gender + ", Hungry: " + hungry;
    }
}

//public class Pet {
//    // object attributes
//    private String name;
//    private String gender;
//    private int hunger;
//
//    // constructors
//    public Pet(String name, String gender, int hunger){
//        this.name = name;
//        this.gender = gender;
//        this.hunger = hunger;
//    }
//
//    // getters
//    public String getName(){
//        return name;
//    }
//
//    public String getGender(){
//        return gender;
//    }
//
//    public int getHunger(){
//        return hunger;
//    }
//
//    // setters
//    public void setName(String newName){
//        gender = newName;
//    }
//
//    public void setGender(String newGender){
//        gender = newGender;
//    }
//
//    public void setHunger(int newHunger){
//        hunger = newHunger;
//    }
//
//    // other
//    public boolean isHungry(){
//        if (hunger > 15){
//            return true;
//        }
//        return false;
//    }
//
//    public String toString() {
//        return name + " is a " + gender +", and it is " + hunger + " that they are hungry.";
//    }
//}
