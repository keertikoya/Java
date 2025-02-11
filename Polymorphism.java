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


        Heel a = new FancyHeel();
        // below: grandparent polymorphism model
        Shoe b = new FancyHeel(7, "black", 2, "banquet");

        System.out.println(b.getSize());
        // System.out.println(b.getHeight());  does NOT work because getHeight() is in heel class
        System.out.println(b); // uses FancyHeel's toString because it was overwritten
        //b.m1() // uses Shoe classes m1 (never overwritten)
        //b.m2() // uses FancyHeel m2 since it was overwritten
    }
}
