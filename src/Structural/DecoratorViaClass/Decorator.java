package Structural.DecoratorViaClass;

public class Decorator extends BaseClass implements MyInterface {

    Decorator(String surname) {
        super(surname);
    }

    public String tell() {
        return super.sound();
    }


    public String generalInfo() {
        return "Das ist ein Jojo-Referenz";

    }
}
