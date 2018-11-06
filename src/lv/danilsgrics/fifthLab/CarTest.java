package lv.danilsgrics.fifthLab;

public class CarTest {

    public static void main(String[] args) {

        Car testCar = new Car("BMW", "M5", "Blue", 305);

        while (testCar.canAccelerate()) {
            testCar.accelerate();
        }

        System.out.println();

        System.out.println("Current speed is " + testCar.getCurrentSpeed());

        System.out.println();

        while (testCar.isDriving()) {
            testCar.slowDown();
        }
    }
}
