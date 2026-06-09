package cicles.exercises;

public class DoWhileInverseNumbers {
    static void main() {
        System.out.println("*** Números inversos ***");

        var count = 10;
        do {
            System.out.println(count-- + "");
        } while(count > 0);
    }
}
