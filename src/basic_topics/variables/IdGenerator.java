package basic_topics.variables;

import java.util.Random;
import java.util.Scanner;

public class IdGenerator {
    static void main() {
        var random = new Random();
        var console = new Scanner(System.in);

        System.out.println("***UNIQUE ID GENERATOR SYSTEM***");

        System.out.println("What's your name? ");
        var name = console.nextLine();

        System.out.println("What's your lastname? ");
        var lastname = console.nextLine();

        System.out.println("When is your birth year? ");
        var birthday = console.nextLine();

        var randomNumber = random.nextInt(9999)+1;
        var result = name.substring(0, 2)
                + lastname.substring(0, 2)
                + birthday.substring(birthday.length()-2)
                + String.format("%04d", randomNumber);

        System.out.printf("""
                \tYour ID is:
                \t%s
                \tCongrats!
                """, result.toUpperCase());
    }
}
