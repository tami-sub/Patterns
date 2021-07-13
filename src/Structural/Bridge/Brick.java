package Structural.Bridge;

public class Brick implements ConstructionType{
    @Override
    public String getBuildingType() {
        return "Brick construction";
    }
}
