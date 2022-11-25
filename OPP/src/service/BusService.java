package service;

import vehicle.Bus;

public class BusService implements RunService{
    public int totalCharge(Bus bus, int n){
        int result = 0;
        result = result + bus.getCharge();
        return result;
    }

}
