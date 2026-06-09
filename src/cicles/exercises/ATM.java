package cicles.exercises;

import java.util.Scanner;

public class ATM {
    static void main() {
        var console = new Scanner(System.in);
        double balance = 1000; // valor inicial del saldo
        var shouldKillProcess = false;

        // menu de la aplicación
        while(!shouldKillProcess) {
            System.out.println("""
                    *** Aplicación de cajero automatico***
                    Operaciones a realizar:
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opción: \s
                    """);

            // porque se ingresará solo números
            var option = console.nextInt();

            // procesamiento por cada caso
            switch (option) {
                case 1:
                    System.out.printf("Saldo actual: %.2f%n%n", balance);
                    break;
                case 2: {
                    System.out.print("Ingresa el monto a retirar: ");
                    var withdrawal = console.nextDouble();
                    if (withdrawal <= balance) {
                        balance -= withdrawal; // balance = balance - withdrawall
                        System.out.printf("Nuevo saldo: %.2f%n%n", balance);
                    } else {
                        System.out.printf("No cuentas con el saldo suficiente. " + "Saldo actual es: %.2f%n%n", balance);
                    }
                    break;
                }
                case 3: {
                    System.out.println("Ingresa el monto a depositar: ");
                    var deposit = console.nextDouble();
                    balance += deposit; // balance = balance + deposit;
                    System.out.printf("Nuevo saldo: %.2f%n%n", balance);
                    break;
                }
                case 4: {
                    System.out.println("Saliendo...");
                    shouldKillProcess = true;
                    break;
                }
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
