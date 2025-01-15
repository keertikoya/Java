public class ShapesArea {
    public static void main (String[] args){
        Shapes[] arr = new Shapes[3]; // array of shapes

        arr[0] = new Circle(5); // circle with radius 5
        arr[1] = new Rectangle(4, 6); // rectangle with length 4 and width 6
        arr[2] = new TriangleShape(3, 4);  // triangle with base 3 and height 4

        for (Shapes shape : arr) { // checks each shape in the array
            System.out.println(shape.calculateArea()); // prints its area
        }
    }
}
