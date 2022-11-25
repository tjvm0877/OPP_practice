package vehicle;

public abstract class PublicTransportation {
    // field
    private int number;
    private int fuel;
    private int speed;
    private Boolean status;
    private int maxPassenger;
    private int presentPassenger;

    public PublicTransportation(){
        this.fuel = 100;
        this.speed = 0;
        this.presentPassenger = 0;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getCurrentPassenger() {
        return presentPassenger;
    }

    public void setPresentPassenger(int presentPassenger) {
        this.presentPassenger = presentPassenger;
    }
}