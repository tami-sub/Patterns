package Creational.Sigleton;

public class Main {
    public static void main(String[] args) {
        System.out.println(BlackPanter.getInstance("Chadwick").getValue());
        System.out.println(BlackPanter.getInstance("John").getValue());

    }
}
