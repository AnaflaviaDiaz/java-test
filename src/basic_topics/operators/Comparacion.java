package basic_topics.operators;

public class Comparacion {
    static void main() {
        System.out.println("***Operadores de comparación***");
        int a = 3, b = 2;

        // igualdad ==
        var result = a == b;
        System.out.println("resultado a == b: "+ result); //=> false

        // distinto !=
        result = a != b;
        System.out.println("resultado a != b: "+ result); //=> true

        // Mayor que >
        result = a > b;
        System.out.println("resultado a > b: "+ result); //=> true

        // Menor que <
        result = a < b;
        System.out.println("resultado a < b: "+ result); //=> false

        // Mayor o igual que >
        result = a >= b;
        System.out.println("resultado a >= b: "+ result); //=> true

        // Menor o igual que <
        result = a <= b;
        System.out.println("resultado a <= b: "+ result); //=> false
    }
}
