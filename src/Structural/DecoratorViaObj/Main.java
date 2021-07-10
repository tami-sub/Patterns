package Structural.DecoratorViaObj;

public class Main {
    public static void main(String[] args) {
        Decorator person = new Decorator("Govanna");
        System.out.println(person.tell());
        System.out.println(person.generalInfo());
    }
}
