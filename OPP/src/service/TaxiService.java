package service;

import vehicle.Taxi;

public class TaxiService implements RunService{
    public int totalCharge(Taxi taxi){
        int result = taxi.getBaseCharge();
        result = result + (taxi.getDestinationLocation() - taxi.getCurrentLocation()) * taxi.getDestinationLocation();
        return result;
    }
    public void payment(Taxi taxi, int fare){
        taxi.setTotalCharge(taxi.getTotalCharge() + fare);
        taxi.setPresentPassenger(0);
    }
}