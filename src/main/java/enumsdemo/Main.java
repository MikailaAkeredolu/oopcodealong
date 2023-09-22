package enumsdemo;

public class Main {
    public static void main(String[] args) {
        //An enumeration ais a list of named constants;

        Soda soda1;
        soda1 = Soda.valueOf("SPRITE");
        System.out.println(soda1);

        Soda[] drinks = Soda.values();
        System.out.println(drinks[2]);



//        Product product1 = new Product("Bread");
//        System.out.println(product1);
//        Product product2 = new Product("Milk");
//        System.out.println(product2);

    }
}
