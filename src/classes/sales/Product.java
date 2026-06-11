package classes.sales;

public class Product {
    private final int idProd;
    private String name;
    private Double price;
    private static int countProducts;

    // constructor
    public Product(String name, double price) {
        this.idProd = ++Product.countProducts;
        this.name = name;
        this.price = price;
    }

    // sobreescribiendo toString de la clase Object
    @Override
    public String toString() {
        return "Product{" +
                "idProd=" + this.idProd +
                ", name='" + this.name + '\'' +
                ", price=" + this.price +
                '}';
    }

    // getters and setters
    public int getIdProd() {
        return this.idProd;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
