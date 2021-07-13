package Structural.Bridge;

public class Monolithic implements ConstructionType{
    @Override
    public String getBuildingType() {
        return "Monolithic construction";
    }
}
