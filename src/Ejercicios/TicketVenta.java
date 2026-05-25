package Ejercicios;

import java.util.Scanner;

public class TicketVenta {
    static void main() {
        System.out.print("*** Ticket de venta ***");
        var console = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var milkPrice = Double.parseDouble(console.nextLine());

        System.out.print("Precio pan: ");
        var breadPrice = Double.parseDouble(console.nextLine());

        System.out.print("Precio tomate: ");
        var tomatoPrice = Double.parseDouble(console.nextLine());

        System.out.print("Precio banana: ");
        var bananaPrice = Double.parseDouble(console.nextLine());

        System.out.print("Aplica algún descuento (%)?: ");
        var percentage = Integer.parseInt(console.nextLine());

        // calculo sin impuestos
        var subTotal = milkPrice + breadPrice + tomatoPrice + bananaPrice;

        // Descuento
        var discount = subTotal * (percentage/100.0);

        // subtotal con descuento
        var subTotalWithDiscount = subTotal - discount;

        // calculo con impuestos
        var tax = subTotalWithDiscount * 0.16;

        // calculo total
        var total = subTotal + tax;
        System.out.printf("""
                Ticket de Venta
                -------
                \n
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto (16%%): $%.2f
                Costo total de la compra: $%.2f
                """, subTotal, discount, percentage, tax, total);
    }
}
