package Structural.DecoratorViaClass;

public class Main {
    public static void main(String[] args) {
        Decorator person = new Decorator("Jostar");
        System.out.println(person.tell());
        System.out.println(person.generalInfo());
    }
}
