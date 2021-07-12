package Structural.Facade;

public class Engine {
    private boolean engineState = false;

    public boolean isEngineState() {
        return engineState;
    }

    public void startEngine() {
        engineState = true;
    }

    public void stopEngine() {
        engineState = false;
    }
}
