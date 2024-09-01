public class Condition {
    public static void main(String[] args) {
        int grade = 78;
        System.out.println("your grade is: " + grade);

        if (grade >= 90){
            System.out.println("you are allowed a meal");
        }
        else if (grade >= 80){
            System.out.println("you are allowed a snack");
        }
        else if (grade >= 70){
            System.out.println("you may drink water");
        }
        else if (grade >= 60){
            System.out.println("you may breathe air");
        }
        else {
            System.out.println("you are disowned. your new last name is Liu.");
        }
    }
}
