package Structural.Bridge;

public class PickHouseBuilder extends HouseBuilder{
    private final ConstructionType HOUSE_TYPE;

    public PickHouseBuilder(ConstructionType house_type) {
        super(house_type);
        this.HOUSE_TYPE = house_type;
    }

    @Override
    public void startBuilding() {
        String name = "Pick";
        System.out.printf("%s company starts %s building%n", name, HOUSE_TYPE.getBuildingType());
    }
}
