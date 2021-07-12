package Structural.Facade;

public class HeadLight {
    private boolean headlightsState = false;

    public boolean isHeadlightsState() {
        return headlightsState;
    }

    public void turnOnHeadLights() {
        headlightsState = true;
        System.out.println("The Driver turned on his HeadLights");
    }

    public void turnOffHeadLights() {
        headlightsState = false;
        System.out.println("The Driver turned off his HeadLights");
    }
}
