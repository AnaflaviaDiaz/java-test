import java.util.Scanner;

public class ManejoConsola {
    static void main() {
        //  system.in para la entrada estandar
        var console = new Scanner(System.in); // in ==> input
        System.out.println("Escribe tu nombre: ");

        var name = console.nextLine(); // para tomar el valor de consola
        System.out.println("El nombre es: " + name);
    }
}
