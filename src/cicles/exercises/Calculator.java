package cicles.exercises;

import java.util.Scanner;

public class Calculator {
    static void main() {
        System.out.println("***Calculadora***");
        var console = new Scanner(System.in);

        double operator1 = 0, operator2 = 0, result;
        var shouldKillProcess = false;

        // ciclo de la aplicacion
        while(!shouldKillProcess) {
            System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    Escoge una opción: \s
                    """);
            var option = console.nextInt();

            // validando si necesita los 2 numeros para realizar las operaciones
            if (option >= 1 && option <=4) {
                System.out.print("Primer número: ");
                operator1 = console.nextDouble();
                System.out.print("Segundo número: ");
                operator2 = console.nextDouble();
            }

            switch (option) {
                case 1: {
                    result = operator1 + operator2;
                    System.out.printf("Resultado suma: %.2f%n%n", result);
                    break;
                }
                case 2: {
                    result = operator1 - operator2;
                    System.out.printf("Resultado resta: %.2f%n%n", result);
                    break;
                }
                case 3: {
                    result = operator1 * operator2;
                    System.out.printf("Resultado multiplicacion: %.2f%n%n", result);
                    break;
                }
                case 4: {
                    result = operator1 / operator2;
                    System.out.printf("Resultado division: %.2f%n%n", result);
                    break;
                }
                case 5: {
                    shouldKillProcess = true;
                    System.out.println("Saliendo...");
                    break;
                }
                default: {
                    System.out.println("Opción inválida");
                    break;
                }
            }
        }
    }
}
