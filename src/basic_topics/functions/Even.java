package basic_topics.functions;

import java.util.Scanner;

public class Even {
    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static void main() {
        System.out.println("Ingresa un número");
        var console = new Scanner(System.in);
        var num = Integer.parseInt(console.nextLine());
        System.out.println(isEven(num) ? "Es par" :  "Es impar");
    }
}
