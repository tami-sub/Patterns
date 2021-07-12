package Structural.Facade;

public class SeatBelt {
    private boolean seatBeltState = false;


    public boolean isSeatBeltState() {
        return seatBeltState;
    }

    public void fastenSeatBelt() {
        seatBeltState = true;
        System.out.println("The Driver fastened the seat belt");
    }

    public void unFastenSeatBelt() {
        seatBeltState = false;
        System.out.println("The Driver unfastened the seat belt");
    }
}
