package conditionals.exercises;

import java.util.Scanner;

public class OnlineShop {
    static void main() {
        System.out.println("*** Tienda en Línea ***");

        var console = new Scanner(System.in);

        System.out.println("Ingresa el monto de tu compra ");
        var amount = Double.parseDouble(console.nextLine());
        System.out.println("¿Eres miembro de la tienda? (si/no)? ");
        var isMember = console.nextLine().equalsIgnoreCase("si");

        double discountPrice = 0;
        double total = 0;
        if (amount > 1000 && isMember) {
            System.out.println("Felicidades, Te concedemos el 10% de descuento! ");
            discountPrice = amount * 0.10; // 10/100
            total = amount - discountPrice;
        } else if (isMember) {
            System.out.println("Felicidades, Te concedemos el 5% de descuento! ");
            discountPrice = amount * 0.05;
            total = amount - discountPrice;
        } else {
            System.out.println("No aplica descuento ");
            total = amount - discountPrice;
        }

        System.out.printf("""
                Monto de compra: $%.2f
                Monto de descuento: $%.2f
                Monto final aplicando descuento: $%.2f
                """, amount, discountPrice, total);
    }
}
