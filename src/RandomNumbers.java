import java.util.Random;

public class RandomNumbers {
    static void main() {
        System.out.println("***Números aleatorios***");
        var random = new Random();

        // generar numero aleaotrio entre 0 y 9
        var randomNumber = random.nextInt(10);
        System.out.println("numero aleatorio: "+randomNumber);

        // generar numero aleaotrio entre 1 y 10
        randomNumber = random.nextInt(10) + 1;
        System.out.println("numero aleatorio: "+randomNumber);

        // generar numero aleaotrio entre 0.0 y 1.0
        var floatRandomNumber = random.nextFloat();
        System.out.println("numero flotante aleatorio: "+floatRandomNumber);
    }
}
