package basic_topics.matrix;

import java.util.Scanner;

public class DataInMatrix {
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

        // iterar los valores de la matriz
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Matriz[" + i + "][" + j + "] = " + matrix[i][j]);
            }

        }
    }
}
