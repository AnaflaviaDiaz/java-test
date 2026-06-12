package basic_topics.matrix;

import java.util.Scanner;

public class SumaDiagonal {
    static void main() {
        int rows, columns;
        var console = new Scanner(System.in);

        // definir la matriz
        System.out.print("Número de filas: ");
        rows = Integer.parseInt(console.nextLine());
        System.out.print("Número de columnas: ");
        columns = Integer.parseInt(console.nextLine());

        var matrix = new int[rows][columns];

        // solicitar los valores
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Valor[" + i + "][" + j + "] = ");
                matrix[i][j] = Integer.parseInt(console.nextLine());
            }
        }

        // suma de la diagonal de la matriz
        var accumDiagonal = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j) {
                    accumDiagonal += matrix[i][j];
                }
            }
        }

        System.out.println("\n Suma diagonal de la matriz es: "+accumDiagonal);
    }
}
