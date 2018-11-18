package lv.danilsgrics.seventhLab;

public class CarTest {

    public static void main(String[] args) {

        Bus testBus = new Bus("Mercedes", "OC 500 LE",
                12310, 2008, true, 35);

        System.out.println(testBus);

        PassengerCar testPassengerCar = new PassengerCar("BMW", "750Li xDrive",
                1990, 2018, true, 'F');

        System.out.println(testPassengerCar);

        Truck testTruck = new Truck("Volvo", "VOLVO FH 460", 8793,
                2015, false, 460);

        System.out.println(testTruck);
    }
}
