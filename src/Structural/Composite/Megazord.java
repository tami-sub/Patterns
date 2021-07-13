package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Megazord {
    private final List<Ranger> RANGERS = new ArrayList<>();

    public void addRanger(Ranger ranger) {
        RANGERS.add(ranger);
    }

    public void removeRanger(Ranger ranger) {
        RANGERS.remove(ranger);
    }

    public void showRangers() {
        for (Ranger ranger : RANGERS) {
            ranger.showColor();
        }
    }
}
