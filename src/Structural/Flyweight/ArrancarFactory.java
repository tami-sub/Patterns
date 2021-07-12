package Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ArrancarFactory {

    private final Map<String, Arrancar> map = new HashMap<>();

    public Arrancar getArrancar(String name,String color){
        Arrancar arrancar = map.get(name);
        if (arrancar == null){
            arrancar = new Arrancar();
            arrancar.setName(name);
            arrancar.setColor(color);
            map.put(name, arrancar);
        }
        return arrancar;
    }
}
