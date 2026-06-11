package classes.sales;

public class Sales {
    static void main() {
        System.out.println("*** Sistema de ventas ***");
        var product1 = new Product("Blusa", 30.00);
        var product2 = new Product("Camiseta", 25.00);
        var product3 = new Product("Calcetin", 10.00);
        var product4 = new Product("Bufanda", 15.00);

        var order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);
        // order1.showOrder();
        System.out.println(order1);

        var order2 = new Order();
        order2.addProduct(product3);
        order2.addProduct(product4);
        System.out.println(order2);
    }
}
