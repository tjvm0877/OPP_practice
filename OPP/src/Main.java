import service.BusService;
import service.TaxiService;
import vehicle.Bus;
import vehicle.Taxi;

public class Main {
    public static int vehicle_num = 1000;
    public static Bus getBusInstance(){
        vehicle_num = vehicle_num + 1;
        return new Bus(vehicle_num);
    }
    public static Taxi getTaxiInstance(){
        vehicle_num = vehicle_num + 1;
        return new Taxi(vehicle_num);
    }
    public  static void test_bus(){
        System.out.println("-----------Bus Test-----------");
        BusService busRunService = new BusService();

        Bus bus1 = getBusInstance();
        Bus bus2 = getBusInstance();

        System.out.println("bus1 / bus2 : " + bus1.getNumber() + " / " + bus2.getNumber());

        int bus_passenger1 = 5;
        busRunService.passengerRide(bus1, bus_passenger1);
        // 출력
        System.out.println("탑승 승객 수: " + bus1.getCurrentPassenger());
        System.out.println("잔여 승객 수: " + (bus1.getMaxPassenger() - bus1.getCurrentPassenger()));
        System.out.println("요금 확인 : " + busRunService.totalCharge(bus1, bus_passenger1));
        System.out.println("버스 상태 : " + bus1.getCurrentPassenger());
        busRunService.changeFuel(bus1, -50);
        busRunService.changeStatus(bus1, false);
        busRunService.changeFuel(bus1, 10);
        if (!bus1.getStatus()){
            System.out.println("운행 종료");
        }
        else{
            System.out.println("운행 중");
        }
        System.out.println("잔여 주유량: " + bus1.getFuel());
        busRunService.changeStatus(bus1, true);
        busRunService.passengerRide(bus1, 45);
        int bus_passenger2 = 5;
        busRunService.passengerRide(bus1, bus_passenger2);

        System.out.println("탑승 승객 수: " + bus1.getCurrentPassenger());
        System.out.println("잔여 승객 수: " + (bus1.getMaxPassenger() - bus1.getCurrentPassenger()));
        System.out.println("(승객의 나이에 따라 요금을 변경하는 기능 추가 구현)");
        System.out.println("요금 확인 : " + busRunService.totalCharge(bus1, bus_passenger2));
        busRunService.changeFuel(bus1,-55);
        System.out.println("잔여 주유량: " + bus1.getFuel());
        if (!bus1.getStatus()){
            System.out.println("운행 종료");
        }
        else{
            System.out.println("운행 중");
        }
    }
    public static void test_taxi(){
        System.out.println("-----------Taxi Test-----------");
        TaxiService taxiService = new TaxiService();
        Taxi taxi1 = getTaxiInstance();
        Taxi taxi2 = getTaxiInstance();

        System.out.println("taxi1 / taxi2 : " + taxi1.getNumber() + " / " + taxi2.getNumber());
        System.out.println("주유량: " + taxi1.getFuel());
        if (!taxi1.getStatus()){
            System.out.println("운행 불가");
        }
        else{
            System.out.println("운행 중");
        }
        taxiService.passengerRide(taxi1, 2);
        taxi1.setDestination("서울역");
        taxi1.setDestinationLocation(2);

        System.out.println("탑승 승객 수: " + taxi1.getCurrentPassenger());
        System.out.println("잔여 승객 수: " + (taxi1.getMaxPassenger() - taxi1.getCurrentPassenger()));
        System.out.println("기본 요금 확인: " + taxi1.getBaseCharge());
        System.out.println("목적지: " + taxi1.getDestination());
        System.out.println("목적지까지 거리(km): " + taxi1.getDestinationLocation());
        System.out.println("지불할 요금: " + taxiService.totalCharge(taxi1));

        taxiService.changeFuel(taxi1, -80);
        taxiService.payment(taxi1, taxiService.totalCharge(taxi1));
        System.out.println("주유량: " + taxi1.getFuel());
        System.out.println("누적요금: " + taxi1.getTotalCharge());

        taxiService.passengerRide(taxi1, 5);
        taxiService.passengerRide(taxi1, 3);
        taxi1.setDestination("구로디지털단지역");
        taxi1.setDestinationLocation(12);

        System.out.println("탑승 승객 수: " + taxi1.getCurrentPassenger());
        System.out.println("잔여 승객 수: " + (taxi1.getMaxPassenger() - taxi1.getCurrentPassenger()));
        System.out.println("기본 요금 확인: " + taxi1.getBaseCharge());
        System.out.println("목적지: " + taxi1.getDestination());
        System.out.println("목적지까지 거리(km): " + taxi1.getDestinationLocation());
        System.out.println("지불할 요금: " + taxiService.totalCharge(taxi1));

        taxiService.changeFuel(taxi1, -20);
        taxiService.payment(taxi1, taxiService.totalCharge(taxi1));

        System.out.println("주유량: " + taxi1.getFuel());
        System.out.println("누적요금: " + taxi1.getTotalCharge());
        if (!taxi1.getStatus()){
            System.out.println("운행 불가");
        }
        else{
            System.out.println("운행 중");
        }
    }

    public static void main(String[] args) {
        test_bus();
        test_taxi();
    }
}