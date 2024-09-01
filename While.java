public class While {
    public static void main(String[] args) {
        int x = 0;

//        while (x == 0){ // infinite loop
//            System.out.println("i'm equal to 0!");
//        }

        while (x == 10){ // condition
            System.out.println("i'm equal to 10!");
        }

        while (x < 10){
            System.out.println("i'm less than 10!");
            x = x + 1;
        }
    }
}
