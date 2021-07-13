package Structural.Composite;

public class Main {
    public static void main(String[] args) {
        Megazord megazord = new Megazord();

        BlackRanger ranger1 = new BlackRanger();
        YellowRanger ranger2 = new YellowRanger();
        RedRanger ranger3 = new RedRanger();

        megazord.addRanger(ranger1);
        megazord.addRanger(ranger2);
        megazord.removeRanger(ranger2);
        megazord.addRanger(ranger3);
        megazord.showRangers();

    }
}
