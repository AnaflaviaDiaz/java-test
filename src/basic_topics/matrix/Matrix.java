package basic_topics.matrix;

public class Matrix {
    // matriz de 3 columnas y 2 renglones
    static void main() {
        // inicializando matriz
        var matrix = new int[][]{
                {100, 200, 300},
                {400, 500, 600}
        };

        // 1. ciclo externo - filas
        for (int i = 0; i < matrix.length; i++) {
            // 2. ciclo interno - columnas
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("basic_topics.matrix["+i+"]["+j+ "]" + matrix[i][j]);
            }
        }
    }
}
