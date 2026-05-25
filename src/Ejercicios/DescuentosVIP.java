package Ejercicios;

import java.util.Scanner;

public class DescuentosVIP {
    static void main() {
        System.out.println("***Descuentos VIP***");
        final var numberOfDiscountProducts = 10;

        var console = new Scanner(System.in); // permite que se ingrese datos por consola

        System.out.println("Ingresa número de productos que compraste hoy");
        var currentNumberOfProducts = Integer.parseInt(console.nextLine()); // convierte a numero

        System.out.println("¿Eres miembro de la tienda? si o no");
        var questionMember = console.nextLine();

        var isMember = questionMember.equalsIgnoreCase("si") || questionMember.equalsIgnoreCase("sí");

        if (currentNumberOfProducts >= 10 && isMember) {
            System.out.println("Tienes acceso al descuento VIP");
        } else {
            System.out.println("No tienes acceso al descuento VIP");
        }
    }
}
