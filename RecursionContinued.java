// Keerti Koya
// Period 1

public class RecursionContinued {
    
    public static void reverseCounter(int x) {
        // end state
        if (x==0){
            System.out.println(0);
        }

        // recursive state (loop)
        else{
            System.out.println(x);
            reverseCounter(x-1);
        }
    }

    public static int face(int x){
        // end state
        if (x==0){
            return 1;
        }

        // recursive state (loop)
        else{
            return x + face(x-1);
        }
    }

    public static void counter(int x){
        // end state
        if (x == 0) {
            System.out.println(0);
            ;
        }

        // recursive state (loop)
        else {
            System.out.println(x); // pre-recursive action ( 5 4 3 2 1 0)
            counter(x - 1);
            System.out.println(x); // post-recursive action (0 1 2 3 4 5)
        }
    }
}
