// Keerti Koya
// Period 1
// 12/10/24

public class Triangle{
        Point a;
        Point b;
        Point c;

        public String Identify(){
            double d1 = a.distance(b);
            double d2 = b.distance(c);
            double d3 = a.distance(c);

            if (d1 == d2 && d2 == d3){
                return "equilateral";
            }
            else if (d1 == d2 || d2 == d3 || d1 == d3){
                return "isosceles";
            }
            else{
                return "scalene";
            }
        }

        public boolean rightTriangle(){
//            double s1 = a.slope(b);
//            double s2 = b.slope(c);
//            double s3 = a.slope(c);

//            if (s1 * (-1) == s2 || s2 * (-1) == s3 || s1 * (-1) == s3){
//                return true;
//            }
//            else{
//                return false;
//            }
            return false;
        }

        public String toString(){
            String angle = "nonright";
            if (rightTriangle()){
                angle = "right";
            }
            return "I am a " + angle + Identify() + " triangle.";
        }
}
