// Keerti Koya
// Period 1
// 1/8/25

import java.util.ArrayList;

public class Quadrilateral {
    ArrayList<Point> pointArr = new ArrayList<Point>(4);

    // add four points to the Point ArrayList
    public Quadrilateral (Point a, Point b, Point c, Point d){
        pointArr.add(a);
        pointArr.add(b);
        pointArr.add(c);
        pointArr.add(d);
    }

    // getter + setter methods
    public Point getPoint(int spot) {
        return pointArr.get(spot);
    }

    public void setPoint(int spot, Point x) {
        pointArr.set(spot, x);
    }

    // calculates and returns perimeter
    public double perimeter() {
        double perimeter = 0.0; // starts with 0
        for (int i = 0; i < pointArr.size(); i++) { // iterates through each value in pointArr
            Point first = pointArr.get(i); // gets one point
            Point second = pointArr.get((i + 1) % pointArr.size()); // refers to the next point (will come back to the first point)
            perimeter += first.distance(second); // adds the distance between first and second points to perimeter
        }
        return perimeter; // return final value
    }

    // calculates and returns the error
    public double area() {
        double sum1 = 0.0;
        double sum2 = 0.0;
        for (int i = 0; i < pointArr.size(); i++) {
            Point first = pointArr.get(i); // gets one point
            Point second = pointArr.get((i + 1) % pointArr.size()); // refers to the next point (will come back to the first point)
            sum1 += first.getX() * second.getY(); // multiplies x-coordinate of the first vertex with y-coordinate of second vertex
            sum2 += first.getY() * second.getX(); // multiplies y-coordinate of the first vertex with x-coordinate of second vertex
        }
        return Math.abs(sum1 - sum2) / 2.0; // signed area / 2 to get the actual area
    }
}
