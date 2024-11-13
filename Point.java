// Keerti Koya
// Period 1
// 11/12/24

import java.util.*;

public class Point {
    private int x;
    private int y;

    // constructor
    public Point(int a, int b) {
        x = a;
        y = b;
    }

    // getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // setter methods
    public void setX(int a) {
        x = a;
    }

    public void setY(int b){
        y = b;
    }

    // toString method
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }
}
