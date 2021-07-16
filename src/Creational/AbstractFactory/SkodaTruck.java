package Creational.AbstractFactory;

public class SkodaTruck implements Truck{
    private final String BRAND_NAME = "Skoda truck";
    @Override
    public void manufacture() throws InterruptedException {
        System.out.printf("%s is creating... %n", BRAND_NAME);
        Thread.sleep(5500);
        System.out.printf("%s was created %n", BRAND_NAME);
    }
}
