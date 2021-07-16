package Creational.AbstractFactory;

public class VolkswagenCar implements Car {
    private final String BRAND_NAME = "Volkswagen car";

    public void manufacture() throws InterruptedException {
        System.out.printf("%s is creating... %n", BRAND_NAME);
        Thread.sleep(1000);
        System.out.printf("%s was created, Ist das gut oder nicht? %n", BRAND_NAME);
    }
}
