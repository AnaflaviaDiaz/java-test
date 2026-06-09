package arrays;

public class Array {
    static void main() {
        // int[] integers = {100, 200, 300, 400, 500};

        // con var
        var integers = new int[]{100, 200, 300, 400, 500};

        for (int i = 0; i < integers.length; i++) {
            System.out.println("Valor " + (i+1) + " "  + integers[i]);
        }
    }
}
