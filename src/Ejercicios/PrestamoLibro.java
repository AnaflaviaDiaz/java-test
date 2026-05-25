package Ejercicios;

import java.util.Scanner;

public class PrestamoLibro {
    static void main() {
        var console =  new Scanner(System.in);
        final var allowedKM = 3;

        System.out.println("¿Tienes credenciales de estudiante?: si o no");
        var consoleHasCredentials = console.nextLine();

        System.out.println("¿A cuántos kilómetros vives de la biblioteca?");
        var currentKm = Integer.parseInt(console.nextLine());

        var hasCredentials = consoleHasCredentials.equalsIgnoreCase("si");

        var result = hasCredentials && currentKm <= allowedKM ? "Prestamo aprobado" : "Prestamo rechazado";
        System.out.println(result);
    }
}
