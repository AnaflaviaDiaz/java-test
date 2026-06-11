package classes.sales;

public class Order {
    private final int idOrder;
    private Product[] products;
    private int countProducts;
    private static final int MAX_PRODUCTS = 10;
    private static int countOrders;

    // constructor
    public Order() {
        this.idOrder = ++Order.countOrders;
        this.products = new Product[Order.MAX_PRODUCTS];
    }

    public void addProduct(Product product) {
        // agrega dinamicamente al arreglo cada producto que se envia en este metodo
        if (this.countProducts < Order.MAX_PRODUCTS) {
            // se incrementa en 1,
            this.products[this.countProducts++] = product;
        } else {
            System.out.println("Se ha superado el máximo de productos: " + Order.MAX_PRODUCTS);
        }
    }

    // suma de todos los precios del producto
    public double getTotal() {
        double total = 0;
        for (int i = 0; i < this.countProducts; i++) {
            total += this.products[i].getPrice();
        }
        return total;
    }

    public void showOrder() {
        System.out.println("Id Order: " + this.idOrder);
        var total = this.getTotal();
        System.out.println("\tTotal de la Orden: $" + total);

        System.out.println("\tProducts de la orden: ");
        for (int i = 0; i < this.countProducts; i++) {
            System.out.println("\t\t" + this.products[i]);
        }
    }

    @Override
    public String toString() {
        var result = "Id Order: " + this.idOrder + "\n";
        var total = this.getTotal();
        result += "\tTotal de la Orden: $" + total + "\n";

        result += "\tProducts de la orden: " + "\n";
        for (int i = 0; i < this.countProducts; i++) {
            result += "\t\t" + this.products[i] + "\n";
        }

        return result;
    }
}
