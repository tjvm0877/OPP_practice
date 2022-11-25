package service;

import vehicle.PublicTransportation;

public interface RunService {
    default void runStart(PublicTransportation publicTransportation){
        publicTransportation.setStatus(true);
    }
    default void changeSpeed(PublicTransportation publicTransportation, int speed){
        if(publicTransportation.getFuel() < 10){
            System.out.println("주유 필요");
            return;
        }
        if(speed < 0){
            speed = 0;
        }
        publicTransportation.setSpeed(speed);
    }
    default void changeStatus(PublicTransportation publicTransportation, boolean status){
        if(status){
            publicTransportation.setStatus(status);
            return;
        }
        publicTransportation.setStatus(status);
        publicTransportation.setPresentPassenger(0);
    }
    default void passengerRide(PublicTransportation publicTransportation, int num){
        if (publicTransportation.getCurrentPassenger() + num > publicTransportation.getMaxPassenger()){
            System.out.println("최대 승객 수 초과");
            return;
        }
        publicTransportation.setPresentPassenger(publicTransportation.getCurrentPassenger()+num);
    }
    default void changeFuel(PublicTransportation publicTransportation, int num){
        int tmp = publicTransportation.getFuel() + num;
        if (tmp < 0){
            tmp = 0;
        }
        publicTransportation.setFuel(tmp);
        if (tmp < 10){
            publicTransportation.setStatus(false);
            System.out.println("주유 필요");
        }
    }
}