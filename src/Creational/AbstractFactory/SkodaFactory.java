package Creational.AbstractFactory;

public class SkodaFactory implements Factory {
    @Override
    public Car createNewCar() {
        return new SkodaCar();
    }

    @Override
    public Truck createNewTruck() {
        return new SkodaTruck();
    }
}
