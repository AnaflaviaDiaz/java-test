package basic_topics.conditionals.exercises;

import java.util.Scanner;

public class FitnessHealth {
    static void main() {
        System.out.println("*** Salud y fitness ***");

        // constantes
        final var META_PASOS_DIARIO = 10_000;
        final var CALORIAS_POR_PASO = 0.04;

        // Pedimos los valores al ausuario
        var console = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre?");
        var userName = console.nextLine();

        System.out.println("¿Cuántos pasos has caminado hoy?");
        var dailyWalks = Integer.parseInt(console.nextLine());

        // verificar si el usuario alcanzó la meta de pasos diarios
        var metaAlcanzada = (dailyWalks >= META_PASOS_DIARIO) ? "SÍ" : "NO";

        // calculamos las calorias quemadas
        var caloriasQuemadas = dailyWalks * CALORIAS_POR_PASO;

        System.out.printf("""
                %nUsuario: %s
                Pasos dados hoy: %d
                Calorías quemadas: %.2f kcal
                Meta de pasos diario alcanzada: %s
                -------La meta de pasos diarios es de: %d pasos
                """, userName, dailyWalks, caloriasQuemadas, metaAlcanzada, META_PASOS_DIARIO);
    }
}
