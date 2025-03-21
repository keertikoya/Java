// Keerti Koya
// Period 1

public class RecursionPractice {
    public static void cat(){
        for (int i = 0; i < 5; i++){
            System.out.println("meow");
        }
    }

    public static void recursiveCat( int x ){
        System.out.println("meow!");
        if (x > 0){
            recursiveCat(x-1);
        }
    }
}
