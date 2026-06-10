package classes.arithmetic.test;
import classes.arithmetic.Arithmetic;

public class ArithmeticTest {
    static void main() {
        var arithmetic1 = new Arithmetic(5, 7);
        // para obtener el valor del operador 1, llamando al método getOperator1
        System.out.println("atributo operator1" + arithmetic1.getOperator1());

        // para establecer el valor del operador 1 y 2, llamando al método setOperator1
        arithmetic1.setOperator1(20);
        arithmetic1.setOperator2(15);

        // -----

        arithmetic1.addition();
        arithmetic1.subtraction();

        var arithmetic2 = new Arithmetic(15, 3);
        arithmetic2.addition();
        arithmetic2.subtraction();
    }
}
