package basic_topics.classes.animals;

public class Animal {
    // modificador de acceso protected,
    // significa que no es publico para todas las clases
    // pero sí accedido por las clases hijas
    protected void eat() {
        System.out.println("comer");
    }

    protected void sleep() {
        System.out.println("dormir");
    }
}

// la herencia => extends de la clase Animals
class Dog  extends Animal {
    void bark() {
        System.out.println("hacer ruido");
    }

    // sobreescribiendo el metodo de eat() de Animals
    @Override
    protected void sleep() {
        System.out.println("dormir - sobreescrito");

        // para llamar el metodo sleep() de la clase padre (Animal)
        super.sleep();
    }
}

class AnimalTest {
    static void main() {
        System.out.println("***Ejemplo de Herencia***");
        System.out.println("Clase Padre");
        var animal1 = new Animal();
        animal1.eat();
        animal1.sleep();

        // bark() => no está en la clase padre
        System.out.println("\nClase Hija");
        var dog1 = new Dog();
        dog1.bark();
        dog1.eat();
        dog1.sleep();
    }
}