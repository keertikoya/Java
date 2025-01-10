// Keerti Koya
// Period 1
// 12/10/24

public class TriangularPrism extends Triangle{
    Triangle a;
    int height;

    public String toString(){
        String angle = "nonright";
        if (a.rightTriangle()){
            angle = "right";
        }
        return "My base is a " + a.Identify() + " " + angle + " triangle. My height is " + height;
    }
}
