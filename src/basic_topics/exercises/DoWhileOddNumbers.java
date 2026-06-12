package basic_topics.exercises;

public class DoWhileOddNumbers {
    static void main() {
        System.out.println("*** Números impares ***");

        var count = 0;
        do {
            if(count % 2 != 0) {
                System.out.println(count);
            }
            count ++;
        } while(count <= 20);
    }
}
