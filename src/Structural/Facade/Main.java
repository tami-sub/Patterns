package Structural.Facade;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Driver("Billy"));
        car.startDriving();

        Car car2 = new Car(new Driver("Van"));
        car2.startEngine();
        car2.startDriving();
        car2.stopEngine();
        car2.startDriving();

        Car car3 = new Car(new Driver("Danny"));
        car3.startEngine();
        car3.fastenSeatBelt();
        car3.turnOnHeadLights();
        car3.startDriving();
    }
}
