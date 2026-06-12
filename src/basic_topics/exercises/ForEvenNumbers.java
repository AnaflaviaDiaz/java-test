package basic_topics.exercises;

public class ForEvenNumbers {
    static void main() {
        System.out.println("*** Números pares usando el ciclo For ***");
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
