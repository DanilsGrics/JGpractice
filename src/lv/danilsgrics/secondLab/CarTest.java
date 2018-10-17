package lv.danilsgrics.secondLab;

public class CarTest {

    public static void main(String[] args) {

        Car firstCar = new Car();
        Car secondCar = new Car();

        firstCar.setColourOfCar("Red");
        firstCar.setMakeOfCar("BMW");
        firstCar.setProductionDateOfCar(2017);

        secondCar.setColourOfCar("Blue");
        secondCar.setMakeOfCar("Toyota");
        secondCar.setProductionDateOfCar(2011);

        System.out.println("Information about the first car: colour " + firstCar.getColourOfCar() +
                ", make " + firstCar.getMakeOfCar() + ", production date " +
                firstCar.getProductionDateOfCar());

        System.out.println("Information about the second car: colour " + secondCar.getColourOfCar() +
                ", make " + secondCar.getMakeOfCar() + ", production date " +
                secondCar.getProductionDateOfCar());
    }
}
