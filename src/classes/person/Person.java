package classes.person;

public class Person {
    private String name;
    private String lastname;

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
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

    public void showPerson() {
        System.out.println("Nombre: " + this.name);
        System.out.println("Nombre: " + this.lastname + "\n");
    }
}
