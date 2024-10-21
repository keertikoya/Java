// Keerti Koya
// Period 1
// 10/15/24

public class StringMods {
    public static void main(String[] args) {
        String x = "msjhs girls volleyball";

        // 2. find the index of 'll'
        System.out.println(x.indexOf("ll")); // 14

        // 4. length of word
        System.out.println(x.length()); // 22

        // 6. compareTo 'msjhs girls tennis'
        String tennis = "msjhs girls tennis";
        System.out.println(tennis.compareTo(x));

        // 8. same as “MSJHS girls volleyball”?
        // Nope, capitalized letters are treated differently in the ASCII number system,
        // so both phrases would not be considered the same.

        // 10. compare to "MSJHS"
        System.out.println(x.compareTo("MSJHS"));
    }
}
