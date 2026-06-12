package basic_topics.conditionals.exercises;

import java.util.Scanner;

public class BankingSystem {
    static void main() {
        System.out.println("*** Banking System ***");

        var console = new Scanner(System.in);

        System.out.println("¿Desea continuar dentro del sistema? (si/no)");
        boolean canContinue = console.nextLine().equalsIgnoreCase("si");

        System.out.println(!canContinue ? "saliendo del sistema" : "continuamos dentro del sistema");
    }
}
