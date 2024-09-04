public class Increment {
    public static void main(String[] args) {
        /*
        block comment
         */

        int i = 0;
        i++; // increments by 1 (pre-increment)
        ++i; // increments by 1 (post-increment)

        // below two lines do the same thing
        i = i + 5;
        i+=5;

        // same goes for +, -, *, /, %
        i = i * 5;
        i*=5;

        // if you only have one statement in the if loop, you don't need brackets
        int grade = 90;
        if (grade >= 90)
            System.out.println("yay");
        else if (grade >= 80)
            System.out.println("nice try");
        else
            System.out.println("try harder :)");

        // for loop
        for (int j = 1; j <= 10; j++){ // declare var, condition, auto increments after loop is completed
            System.out.println(j);
        }

    }
}
