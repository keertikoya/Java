// Keerti Koya
// Period 1

public class Recursion {
    public static void ily() {
        for (int i = 0; i < 5; i++){
            System.out.println("ily");
        }
    }

    public static void ily2(int x){
        System.out.println("ily2");
        if (x > 0){
            ily2(x-1); // calls the method itself
        }
    }
}
