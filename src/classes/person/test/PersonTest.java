package classes.person.test;
import classes.person.Person;

public class PersonTest {
    static void main() {
        System.out.println("*** Creacion de Clase y Objetos Persona ***");
        var obj1 =  new Person("Ana", "Diaz");
        obj1.showPerson();

        var obj2 =  new Person("Maria", "Paredes");
        obj2.showPerson();
    }
}
