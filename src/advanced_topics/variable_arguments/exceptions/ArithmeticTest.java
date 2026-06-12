package advanced_topics.variable_arguments.exceptions;

public class ArithmeticTest {
    static void main() {
        try {
            var result = Arithmetic.division(15, 0);
            System.out.println("Resultado: " + result);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Se muestra aunque pase error o caso de exito");
        }
    }
}
