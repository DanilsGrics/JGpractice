package lv.danilsgrics.seventhLab;

import java.util.Objects;

public class Car {

    protected String manufacturer;
    protected String model;
    protected int weight;
    protected int yearOfManufacture;
    protected boolean allWheelDrive;

    public Car(String manufacturer, String model, int weight, int yearOfManufacture, boolean allWheelDrive) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.weight = weight;
        this.yearOfManufacture = yearOfManufacture;
        this.allWheelDrive = allWheelDrive;
    }

    @Override
    public String toString() {
        return "Car{" + "manufacturer: " + manufacturer +
                ", model: " + model + ", weight: " + weight +
                "KG, year of manufacture: " + yearOfManufacture +
                ", has all wheel drive: " + allWheelDrive + "}";
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Car that = (Car) o;

        return Objects.equals(manufacturer, that.manufacturer) &&
                Objects.equals(model, that.model) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(yearOfManufacture, that.yearOfManufacture) &&
                Objects.equals(allWheelDrive, that.allWheelDrive);
    }
}
