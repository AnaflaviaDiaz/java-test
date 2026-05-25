package variables;

import java.util.Scanner;

public class Employeers {
    static void main() {
        System.out.println("***Sistema de empleados***");

        var console = new Scanner(System.in);

        System.out.println("Nombre de empleado: ");
        var name = console.nextLine(); // porque es un string el nombre

        System.out.println("Edad de empleado: ");
        // para convertir a número la edad, porque nextLine retorna string
        var age = Integer.parseInt(console.nextLine());

        System.out.println("salario de empleado: ");
        var salary = Double.parseDouble(console.nextLine());

        System.out.println("¿Es jefe de departamento?: ");
        var isBoss = Boolean.parseBoolean(console.nextLine());

        // ----- RESULTS-----
        System.out.println("\nDatos del empleado: ");
        System.out.println("\nNombre: "+ name);
        System.out.println("\nEdad: "+age);
        System.out.println("\nSalario: "+String.format("$%.2f",salary));
        System.out.println("\n¿Es jefe?: "+(isBoss ? "Sí" : "No"));
    }
}
