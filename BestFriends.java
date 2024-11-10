// Keerti Koya
// Period 1
// 11/6/24

public class BestFriends {
    public static void main(String[] args) {
        Friend one = new Friend ("Sarah", 12, new Shoe(8, "black", "Adidas"));
        // new Shoe because you need to create a new shoe object
        Friend two = new Friend ("Kaylee", 12, new Shoe(6, "white", "New Balance"));
        Friend three = new Friend ("Aanya", 12, new Shoe(7, "white", "Nike"));
        Friend four = new Friend ("Tarini", 12, new Shoe(8, "gray", "Converse"));
        Friend five = new Friend ("Anson", 12, new Shoe(8, "blue", "Nike"));

        Friend[] classroom = new Friend[5];
        classroom[0] = one;
        classroom[1] = two;
        classroom[2] = three;
        classroom[3] = four;
        classroom[4] = five;

        System.out.println(classroom[2].getShoe().getSize());
        classroom[1].getShoe().setColor("silver");
    }
}
