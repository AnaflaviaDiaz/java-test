package functions;

public class Add {
    static int accum(int a, int b) {
        return a + b;
    }

    static void main() {
        System.out.println("Resultado: " + accum(2, 5));
        System.out.println("Resultado: " + accum(5, 10));
    }
}
