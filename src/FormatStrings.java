public class FormatStrings {
    static void main() {
        var name = "Ana";
        var age = 28;
        var salary = 2100.50;

        //  String.format
        var msg = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", name, age, salary);
        System.out.println(msg);

        //  Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f", name, age, salary);
    }
}
