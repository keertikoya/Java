// Keerti Koya
// Period 1

import java.util.ArrayList;
import java.util.Scanner;

public class PetSmart {
    public static void main(String[] args) {
        ArrayList<Pet> kennel = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int operationCount = 0;

        System.out.println("PetSmart");
        System.out.println("1) View pets");
        System.out.println("2) Add pet");
        System.out.println("3) Remove pet");
        System.out.println("4) Feed a pet");
        System.out.println("5) Total revenue");
        System.out.println("6) Update dog miles walked or cat litter changes");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

    }
}
