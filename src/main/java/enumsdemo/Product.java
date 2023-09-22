package enumsdemo;

public class Product {

    private static int numberOfProducts;  // 0
    private int productID;
    private String name;

    public Product(String name) {
        this.name = name;
        this.productID = ++numberOfProducts;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                '}';
    }
}
