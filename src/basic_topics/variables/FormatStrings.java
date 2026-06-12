package basic_topics.variables;

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

        var employerNumber = 12;
        // text block
        // \s ==> space, \t ==> tabulador
        // $%.2f ==> para 2 decimales
        // %04d ==> 4 digitos, se completa con 0s adelante
        msg = """
                %nDetalle Persona: \s
                -----
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """.formatted(name, employerNumber, age, salary);
        System.out.println(msg);

        // formateo con textBlock y printf
        System.out.printf("""
                %nDetalle Persona: \s
                -----
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """, name, employerNumber, age, salary);
    }
}
