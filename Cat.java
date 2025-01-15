public class Cat extends Pet {
    private String breed;
    private int litterBoxChanges;

    public Cat (String name, String gender, String breed) {
        super(name, gender);
        this.breed = breed;
        this.litterBoxChanges = 0;
    }

    // getters
    public String getBreed() {
        return breed;
    }

    public int getLitterBoxChanges() {
        return litterBoxChanges;
    }

    // setters
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // other
    public void addLitterBoxChange() { // increase litterBoxChanges count by 1
        this.litterBoxChanges++;
    }

    // toString method
    public String toString() {
        return super.toString() + ", Breed: " + breed + ", Litter Box Changes: " + litterBoxChanges;
    }
}




//public class Cat extends Pet {
//
//    private String breed;
//    private int litter;
//
//    // custom constructor
//    public Cat(String n, String g, int h, String b, int l){
//        super(n, g, h, l);
//        breed = b;
//    }
//
//    // getter
//    public String getBreed(){
//        return breed;
//    }
//
//    public int getLitter(){
//        return litter;
//    }
//
//    // setter
//    public void setBreed(String b){
//        breed = b;
//    }
//
//    public void setLitter(int l) {
//        litter = l;
//    }
//
//    // litter box???
//    public int changeLitterBoxTotal(int l){
//        return l;
//    }
//}