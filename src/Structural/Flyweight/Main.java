package Structural.Flyweight;

public class Main {
    public static void main(String[] args) {
        ArrancarFactory factory = new ArrancarFactory();
        Arrancar primeraEspada = factory.getArrancar("Starrk", "blue");
        Arrancar segundaEspada = factory.getArrancar("Baraggan", "dark");
        Arrancar primeraEspada2 = factory.getArrancar("Starrk", "aqua");

        System.out.println(primeraEspada.getName() + "  " + primeraEspada.getColor());
        System.out.println(segundaEspada.getName() + "  " + segundaEspada.getColor());
        System.out.println(primeraEspada2.getName() + "  " + primeraEspada2.getColor());
    }
}
