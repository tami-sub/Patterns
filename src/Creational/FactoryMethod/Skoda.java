package Creational.FactoryMethod;

public class Skoda implements Car{
    private final String BRAND_NAME = "Skoda";
    @Override
    public void manufacture() throws InterruptedException {
        System.out.printf("%s is creating... %n", BRAND_NAME);
        Thread.sleep(2500);
        System.out.printf("%s was created %n", BRAND_NAME);
    }
}
