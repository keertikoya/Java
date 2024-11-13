// Keerti Koya
// Period 1
// 11/12/24

import java.util.*;

public class Line {
    private Point a;
    private Point b;

    public Line(Point one, Point two) { // constructor (object Line has two attributes, both Point objects)
        a = one;
        b = two;
    }

    // y = mx + b format
    public String slopeInt() {
        double slope = (double) (b.getY() - a.getY()) / (b.getX() - a.getX());
        double yInt = b.getY() - (slope * a.getX());
        return "y = " + slope + "x + " + yInt;
    }

    // ax + by = c format
    public String standard() {
        double slope = (double) (b.getY() - a.getY()) / (b.getX() - a.getX());
        double yInt = b.getY() - (slope * a.getX());
        return slope + "x - y = " + (-yInt);
    }

    // toString() method to print
    public String toString() {
        return "Your 2 points are: " + a + " and " + b;
    }
}
