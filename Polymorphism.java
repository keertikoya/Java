public class Polymorphism {
    public static void main(String[] args) {
        Shoe x = new Shoe();
        Heel y = new Heel();

        // polymorphed shoe
        Shoe z = new Heel();
        // your variable is a shoe. however, it utilizes anything that is overwritten in Heel
        // constructors uses child's

        // Heel can utilize all of its methods and all of the Shoe class' BESIDES the methods it has overwritten in Heel

        // Heel a = new Shoe(); ILLEGAL

        z.stuff1();
        z.stuff2();
    }
}
