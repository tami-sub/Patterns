package Structural.Proxy;

public class Car {
    private final String brandName;

    public Car(String brand) {
        this.brandName = brand;
        System.out.printf("You selected a car: %s%n", brand);
    }

    public String run() {
        return String.format("%s started the race", brandName);
    }
}
