package basic_topics.exercises;

public class WhileAccumulation {
    static void main() {
        System.out.println("** Suma acumulativa **");

        final var MAX = 5;
        var accum = 0;

        // interar los valores
        var num = 1;
        while (num <= MAX) {
            System.out.println("acumulador de suma + número => "+ accum + " + " + num);
            accum += num++; // realiza la suma acumulativa
            // num++ => aumenta su valor;

            System.out.println("suma parcial acumulada: " + accum + "\n");
        }

        System.out.println("La suma de los primeros "+ MAX + " números es: " + accum);
    }
}
