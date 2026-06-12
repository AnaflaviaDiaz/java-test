package advanced_topics.variable_arguments;

public class Foreach {
    static void main() {
        int[] ages = {5,1,30,45};
        for(int age :ages) {
            System.out.println("edad:" +   age);
        }
    }
}
