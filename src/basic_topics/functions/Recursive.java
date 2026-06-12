package basic_topics.functions;

public class Recursive {
    // imprimir del 1 al 5 usando la funcion recursiva

    static void recursive(int num) {
        if (num == 1) {
            System.out.println(num);
        } else {
            recursive(num - 1);
            // no se imprime porque vuelve a llamar a la función, interrumpe el proceso
            System.out.println(num);
        }
    }

    static void main() {
        recursive(5);
    }
}
