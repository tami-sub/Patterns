package Creational.FactoryMethod;

public class VolkswagenFactory implements Factory{
    @Override
    public Car createNewCar() {
        return new Volkswagen();
    }
}
