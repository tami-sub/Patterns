package Structural.Proxy;

public class ProxyCat {

    private Car car;
    private final String brand;


    public ProxyCat(String brand) {
        this.brand = brand;
    }

    public void run() {
        if (car == null) {
            car = new Car(brand);
        }
        System.out.println(car.run());
    }
}
