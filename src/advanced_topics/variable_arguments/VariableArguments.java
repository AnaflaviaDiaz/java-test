package advanced_topics.variable_arguments;

public class VariableArguments {
    static void main() {
        printNumbers(1,2,3,4);
        printParams("hello",1, 2, 3);
    }

    private static void printParams(String name, int ...numbers) {
        System.out.println("Nombre " + name);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    //   cuando no sabemos cuantos parametros vendran, numbers es array
    private static void printNumbers(int ... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
