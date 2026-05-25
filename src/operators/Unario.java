package operators;

public class Unario {
    static void main() {
        System.out.println("*** Operadores unarios ***");
        int a = 3, b=-2, result;
        var c = true;

        // operador unario +
        result = +a; // +3
        System.out.println("resultado +a = " + result);

        // operador unario +
        result = -a; // -3
        System.out.println("resultado -a = " + result);

        // *****operador unario incremento/decremento
        //Pre-incremento
        a=3;
        result = ++a; // primero se incrementa el valor
        System.out.println("resultado ++a = " + result);
        System.out.println("A ya se incrementó = " + a);

        // Post-incremento
        a=3;
        result = a++; // primero se usa el valor y después se incrementa
        System.out.println("resultado a++ = " + result);
        System.out.println("A ya se incrementó = " + a);

        //Pre-decremento
        b = -2;
        result = --b; // primero se incrementa y después se usa el valor
        System.out.println("resultado --b = " + result);
        System.out.println("B ya se decrementó = " + b);

        //Post-decremento
        b = -2;
        result = b--; // primero se usa el valor y después se decrementa
        System.out.println("resultado b-- = " + result);
        System.out.println("B ya se decrementó = " + b);
    }
}
