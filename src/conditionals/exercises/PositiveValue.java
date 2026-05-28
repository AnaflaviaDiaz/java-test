package conditionals.exercises;

import java.util.Scanner;

public class PositiveValue {
    static void main() {
        System.out.println("*** Valor positivo ***");

        var console = new Scanner(System.in);

        System.out.println("Ingresa el número a evaluar");
        var inputNumber = Integer.parseInt(console.nextLine());

        if (inputNumber > 0) {
            System.out.println("Es positivo, " + inputNumber);
        } else if (inputNumber < 0) {
            System.out.println("Es Negativo, " + inputNumber);
        } else {
            System.out.println("Es: " + inputNumber);
        }
    }
}
