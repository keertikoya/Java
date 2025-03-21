// Keerti Koya
// Period 1

import java.util.ArrayList;

public class Shapes {
    public double calculateArea(){ // method that will be overrided in each shape class
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Shapes> arr = new ArrayList<>();
        Circle one = new Circle(4.0);
        arr.add(one);
        Circle two = new Circle(3);
        arr.add(two);
    }
}
