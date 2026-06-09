package arrays;

import java.util.Scanner;

public class Grades {
    static void main() {
        System.out.println("*** Promedio de Calificaciones ***");
        var console = new Scanner(System.in);

        System.out.println("¿Cuántas calificaciones deseas agregar?");
        var numberOfGrades = Integer.parseInt(console.nextLine());

        // creamos el array
        var grades = new int[numberOfGrades];

        // solicitar valores de las calificaciones
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.println("Calificaciones[" + i +"] = ");
            grades[i] = Integer.parseInt(console.nextLine());
        }

        // obtener el promedio de calificaciones
        var accum = 0;
        for (int i = 0; i < numberOfGrades; i++) {
            // accum = accum + grades[i];
            accum += grades[i];
        }

        var average = accum / numberOfGrades;
        System.out.println("\n Promedio de calificaciones: " + average);
    }
}
