package Structural.Facade;

public class Car {
    private final Engine engine = new Engine();
    private final HeadLight headLights = new HeadLight();
    private final SeatBelt seatBelt = new SeatBelt();
    private final Driver driver;


    public Car(Driver driver) {
        this.driver = driver;
    }

    public void startEngine() {
        engine.startEngine();
    }

    public void stopEngine() {
        engine.stopEngine();
    }

    public void fastenSeatBelt() {
        seatBelt.fastenSeatBelt();
    }

    public void unFastenSeatBelt() {
        seatBelt.unFastenSeatBelt();
    }

    public void turnOnHeadLights() {
        headLights.turnOnHeadLights();
    }

    public void turnOffHeadLights() {
        headLights.turnOffHeadLights();
    }

    public void startDriving() {
        driver.startDriving(engine, seatBelt, headLights);
    }
}
