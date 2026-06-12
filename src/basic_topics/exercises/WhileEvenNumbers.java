package basic_topics.exercises;

public class WhileEvenNumbers {
    static void main() {
        System.out.println("*** Números pares del 1 al 20 ***");

        var count = 0;
        while(count <= 20) {
            if (count % 2 == 0) {
                System.out.println(count);
            }
            count++;
        }
    }
}
