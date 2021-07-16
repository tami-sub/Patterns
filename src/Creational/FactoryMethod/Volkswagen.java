package Creational.FactoryMethod;

public class Volkswagen implements Car{
    private final String BRAND_NAME = "Volkswagen";

    public void manufacture() throws InterruptedException {
        System.out.printf("%s is creating... %n", BRAND_NAME);
        Thread.sleep(1000);
        System.out.printf("%s was created, Ist das gut oder nicht? %n", BRAND_NAME);
    }
}
