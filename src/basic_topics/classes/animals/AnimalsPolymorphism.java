package basic_topics.classes.animals;

public class AnimalsPolymorphism {
    protected void makeSound() {
        System.out.println("makeSound - clase Padre");
    }
}

class Perro  extends AnimalsPolymorphism {
    @Override
    protected void makeSound() {
        System.out.println("makeSound - clase Perro");
    }
}

class Gato extends AnimalsPolymorphism {
    @Override
    protected void makeSound() {
        System.out.println("makeSound - clase Gato");
    }
}

class AnimalsPolymorphismTest {
    // metodo poliformico, recibe tipo de dato clase padre pero recibe objetos de las clases hijas
    static void printSound(AnimalsPolymorphism animal) {
        animal.makeSound();
    }

    static void main() {
        //var animal = new AnimalsPolymorphism();
        // animal => makeSound - clase Padre

         var animal = new Perro();
        // animal => makeSound - clase Perro

        // var animal = new Gato();
        // animal => makeSound - clase Gato
        printSound(animal);
    }
}