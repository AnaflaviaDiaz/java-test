package classes.person.test;
import classes.person.Person;

public class PersonTest {
    static void main() {
        System.out.println("*** Creacion de Clase y Objetos Persona ***");
        // System.out.println("Variable estática: " + Person.countPeople);
        var obj1 =  new Person("Ana", "Diaz");
        // System.out.println(obj1.toString());
        System.out.println(obj1); // automaticamente, se llama a toString
        System.out.println("Variable estática: " + Person.getCountPeople());

        // segundo objeto
        var obj2 =  new Person("Laila", "Fernandez");
        System.out.println(obj2);
        System.out.println("Variable estática: " + Person.getCountPeople());
    }
}
