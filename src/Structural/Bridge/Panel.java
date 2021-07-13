package Structural.Bridge;

public class Panel implements ConstructionType{
    @Override
    public String getBuildingType() {
        return "Panel construction";
    }
}
