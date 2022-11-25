package vehicle;

public class Bus extends PublicTransportation{
    private int charge;

    // constructor
    public Bus(int number){
        super();
        this.setNumber(number);
        this.setCharge(1000);
        this.setStatus(true);
        this.setMaxPassenger(30);
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }
}
