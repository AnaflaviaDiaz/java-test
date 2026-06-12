package advanced_topics.variable_arguments;

public class Exceptions {
    static void main() {
        int value1 = 10;
        int value2 = 0;

        try {
            var result = value1 / value2;
            System.out.println(result);
        } catch(Exception e) {
            System.out.println("Ocurrió un error: " + e);
        }
    }
}
