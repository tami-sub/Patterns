package Creational.AbstractFactory;

public class VolkswagenTruck implements Truck{
    private final String BRAND_NAME = "Volkswagen truck";
    @Override
    public void manufacture() throws InterruptedException {
        System.out.printf("%s is creating... %n", BRAND_NAME);
        Thread.sleep(4500);
        System.out.printf("%s was created %n", BRAND_NAME);
    }
}
