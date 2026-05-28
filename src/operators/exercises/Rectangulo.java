package operators.exercises;

import java.util.Scanner;

public class Rectangulo {
    static void main() {
        System.out.println("*** Cálculo del área de un rectángulo ***");

        var console = new Scanner(System.in);

        System.out.println("Proporciona la altura del rectángulo: ");
        var altura = Integer.parseInt(console.nextLine());

        System.out.println("Proporciona la base del rectángulo: ");
        var base = Integer.parseInt(console.nextLine());

        var area = altura * base;
        var perimetro = (altura + base) * 2;

        System.out.printf("""
                El área es: %d
                El perímetro es: %d
                """, area, perimetro);
    }
}
