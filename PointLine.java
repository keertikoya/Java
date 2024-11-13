// Keerti Koya
// Period 1
// 11/12/24

import java.util.*;

public class PointLine {
    public static void main(String[] args) {
        Point first = new Point (1, 3); // creates first Point object
        Point second = new Point(4,5); // creates second Point object

        System.out.println(first); // uses toString() method from Point class
        System.out.println(second); // uses toString() method from Point class

        Line line = new Line(first, second); // creates a line object
        System.out.println(line.slopeInt()); // calls slopeInt() method from Line class
        System.out.println(line.standard()); // calls standard() method from Line class
        System.out.println(line); // uses toString() method from Line class
    }
}
