package Structural.DecoratorViaObj;

public class Decorator implements MyInterface {
    private final BaseClass baseObject;

    Decorator(String surname) {
        this.baseObject = new BaseClass(surname);
    }

    @Override
    public String tell() {
        return baseObject.sound();
    }

    @Override
    public String generalInfo() {
        return "Das ist ein Jojo-Referenz";

    }
}
