package Structural.DecoratorViaClass;

public class BaseClass {

    private final String surname;

    BaseClass(String surname) {
        this.surname = surname;
    }

    public final String sound() {
        return String.format("ARRrr du bist auch Giorno %s", surname);
    }

    public String getSurname() {
        return surname;
    }
}
