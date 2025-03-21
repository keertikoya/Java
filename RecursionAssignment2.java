// Keerti Koya
// Period 1

public class RecursionAssignment2 {
    public static void main(String[] args) {
        System.out.println(bunnyEars(3)); // prints 6
        System.out.println(bunnyEars2(2)); // prints 5
        System.out.println(triangle(4)); // prints 10
        System.out.println(count11("11abc11")); // prints 2
        System.out.println(changePi("xpix")); // prints x3.14x
    }

    public static int bunnyEars(int n){
        if (n==0)
            return 0;
        return (2 + bunnyEars(n-1)); // 2 for every bunny
    }

    public static int bunnyEars2(int n){
        if (n==0)
            return 0;
        if (n%2 == 0)
            return (3 + bunnyEars(n-1)); // 3 for even bunnies
        return (2 + bunnyEars(n-1)); // 2 for odd bunnies
    }

    public static int triangle(int n){
        if (n==0)
            return 0;
        return (n + triangle(n-1)); // add the number itself
    }

    public static int count11(String word){
        if (word.length() < 2) {
            return 0;
        }
        if (word.substring(0,2).equals("11")) {
            return 1 + count11(word.substring(2)); // if it matches, add 1 to count
        }
        return count11(word.substring(1)); // if not, just move forward by one char
    }

    public static String changePi(String word){
        if (word.length() < 2) {
            return word; // if the string has less than 2 chars, return it as is
        }
        if (word.substring(0,2).equals("pi")) {
            return "3.14" + changePi(word.substring(2)); // replace "pi" with 3.14
        }
        return word.charAt(0) + changePi(word.substring(1)); // keep the first character and pass back into methodmes
    }
}
