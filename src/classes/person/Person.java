package classes.person;

public class Person {
    public static int countPeople = 0;
    private final int id;
    private String name;
    private String lastname;

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;

        // incremento del atributo count
        this.id = ++Person.countPeople;
    }

    // sobreescribir metodo toString de la Clase Object
    // que implitamente todas las clases extienden de esta
    @Override
    public String toString() {
        return "ID: " + this.id + ", Nombre: " + this.name + ", Apellido: " + this.lastname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
