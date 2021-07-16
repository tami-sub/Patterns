package Creational.AbstractFactory;

public class VolkswagenFactory implements Factory {
    @Override
    public Car createNewCar() {
        return new VolkswagenCar();
    }

    @Override
    public Truck createNewTruck() {
        return new VolkswagenTruck();
    }
}
