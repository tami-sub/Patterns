package Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        HouseBuilder rant = new RantHouseBuilder(new Monolithic());
        rant.startBuilding();

        HouseBuilder rant1 = new RantHouseBuilder(new Brick());
        rant1.startBuilding();

        HouseBuilder rant2 = new RantHouseBuilder(new Panel());
        rant2.startBuilding();


        HouseBuilder pick = new PickHouseBuilder(new Panel());
        pick.startBuilding();

        HouseBuilder pick1 = new PickHouseBuilder(new Monolithic());
        pick1.startBuilding();

        HouseBuilder pick2 = new PickHouseBuilder(new Brick());
        pick2.startBuilding();
    }
}