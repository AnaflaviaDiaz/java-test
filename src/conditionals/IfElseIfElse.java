package conditionals;

public class IfElseIfElse {
    static void main() {
        // sentencia if
        var age = 10;

        if (age >= 18) {
            System.out.println("Eres mayor de edad");
        } else if (age >= 13 && age < 18) {
            System.out.println("Eres adolescente");
        } else {
            System.out.println("Eres un niño/a");
        }
    }
}
