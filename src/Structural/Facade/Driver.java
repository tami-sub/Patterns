package Structural.Facade;

public class Driver {
    private final String name;

    Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void startDriving(Engine engine, SeatBelt seatBelt, HeadLight headLight) {

        if (engine.isEngineState()) {
            if (seatBelt.isSeatBeltState() & headLight.isHeadlightsState()) {
                System.out.printf("The Driver %s started driving completely safe%n", name);
            } else {
                if (seatBelt.isSeatBeltState()) {
                    System.out.printf("The Driver %s started driving with turned off headlights%n", name);
                } else {
                    System.out.printf("WARNING: The Driver %s started driving without fastening a seatbelt!%n", name);
                }
            }
        } else {
            System.out.printf("The Driver %s can't start driving: The engine is turned off%n", name);
        }
    }
}
