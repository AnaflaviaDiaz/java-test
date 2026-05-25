package operators;

public class Asignacion {
    static void main() {
        System.out.println("*** Operadores de Asignación***");

        var myNumber = 10;
        int myNumber2;

        myNumber2 = 15;

        // asignación compuesta
        // +=
        myNumber += 5; // es lo mismo que: myNumber = myNumber + 5; => 15
        System.out.println("myNumber = "+ myNumber);

        // -=, *=, /=, %=
        myNumber *= 2; // myNumber = myNumber * 2; => 30
        System.out.println("myNumber = " + myNumber);

        // asignación de variables múltiples
        int a = 10, b = 15, c = 20;
        System.out.printf("a = %d, b = %d, c = %d", a, b, c); //%d => double
    }

}
