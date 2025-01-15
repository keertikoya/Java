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
