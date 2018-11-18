package lv.danilsgrics.seventhLab;

import java.util.Objects;

public class PassengerCar extends Car {

    protected char category;

    public PassengerCar(String manufacturer, String model, int weight,
                        int yearOfManufacture, boolean allWheelDrive, char category) {
        super(manufacturer, model, weight, yearOfManufacture, allWheelDrive);
        this.category = category;
    }

    @Override
    public String toString() {
        return "PassengerCar{" + "manufacturer: " + manufacturer +
                ", model: " + model + ", weight: " + weight +
                "KG, year of manufacture: " + yearOfManufacture +
                ", has all wheel drive: " + allWheelDrive +
                ", passenger car category: " + category + "}";
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        PassengerCar that = (PassengerCar) o;

        return Objects.equals(manufacturer, that.manufacturer) &&
                Objects.equals(model, that.model) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(yearOfManufacture, that.yearOfManufacture) &&
                Objects.equals(allWheelDrive, that.allWheelDrive) &&
                Objects.equals(category, that.category);
    }
}
