package vehicle;

public class Taxi extends PublicTransportation{
    // field
    private String destination;

    private int currentLocation;
    private int destinationLocation;
    private int basecharge;
    private int distancecharge;
    private int totalCharge;



    // constructor
    public Taxi(int number){
        super();
        this.setMaxPassenger(4);
        this.setBasecharge(3000);
        this.setDistancecharge(1000);
        this.setNumber(number);
        this.setTotalCharge(0);
        this.setStatus(true);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(int destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public int getBaseCharge() {
        return basecharge;
    }

    public void setBasecharge(int basecharge) {
        this.basecharge = basecharge;
    }

    public int getDistancecharge() {
        return distancecharge;
    }

    public void setDistancecharge(int distancecharge) {
        this.distancecharge = distancecharge;
    }

    public int getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(int totalCharge) {
        this.totalCharge = totalCharge;
    }
}