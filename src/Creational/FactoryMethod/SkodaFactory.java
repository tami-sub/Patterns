package Creational.FactoryMethod;

public class SkodaFactory implements Factory{
    @Override
    public Car createNewCar() {
        return new Skoda();
    }
}
