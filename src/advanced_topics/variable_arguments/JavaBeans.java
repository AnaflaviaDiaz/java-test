package advanced_topics.variable_arguments;

import java.io.Serializable;

public class JavaBeans {
    static void main() {
        var person = new Person();
        person.setName("Ana");
        person.setLastname("Diaz");
        System.out.println(person);
    }
}

// Clase JavaBean
class Person implements Serializable {
    private String name;
    private String lastname;

    // constructor vacio
    public Person() {}

    // getters and setters

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // para que al imprimir el objetoo, uso por defecto esta sobreescritura
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}