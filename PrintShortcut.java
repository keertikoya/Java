public class PrintShortcut {
    public static void main(String[] args) {

        // PRINTING SHORTCUTS
        int x = 16;

        System.out.print("I am ");
        System.out.print(x);
        System.out.println(" years old.");

        System.out.println("I am " + x + " years old.");

        System.out.println(3 + 4);
        System.out.println(3 + 4 + " Mark"); // when int comes first, they are added
        System.out.println("Mark " + 3 + 4); // when the int comes after, they are just combined
    }
}
