package Ejercicios;

import java.util.Scanner;

public class Authentication {
    static void main() {
        System.out.println("***Sistema de Autenticación***");
        final var user = "user123";
        final var pass = "pass123";

        var console = new Scanner(System.in);
        System.out.print("Escribe tu usuario: ");
        var username = console.nextLine();
        System.out.print("Escribe tu contraseña: ");
        var password = console.nextLine();

        var result = username.equals(user) && password.equals(pass);

        System.out.println("Resultado: " +result);
    }
}
