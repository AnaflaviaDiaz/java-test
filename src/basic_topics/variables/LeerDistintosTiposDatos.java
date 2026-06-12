package basic_topics.variables;

import java.util.Scanner;

public class LeerDistintosTiposDatos {
    static void main() {
        // entrada de consola
        var console = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");

        // para tratar el dato como numero
        var age = console.nextInt();
        System.out.println("edad: " + age);
    }
}
