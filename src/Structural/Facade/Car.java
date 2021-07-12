package Structural.Facade;

public class Car {
    private final Engine engine;
    private final HeadLight headLights;
    private final SeatBelt seatBelt;
    private final Driver driver;


    public Car(Engine engine, HeadLight headLights, SeatBelt seatBelt, Driver driver) {
        this.engine = engine;
        this.headLights = headLights;
        this.seatBelt = seatBelt;
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
