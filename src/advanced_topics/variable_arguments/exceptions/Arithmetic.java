package advanced_topics.variable_arguments.exceptions;

public class Arithmetic {
    public static int division(int num, int den) throws Exception {
        if (den == 0) {
            throw new RuntimeException("Division entre 0");
        }

        return num / den;
    }
}
