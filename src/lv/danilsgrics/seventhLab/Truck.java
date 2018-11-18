package lv.danilsgrics.seventhLab;

import java.util.Objects;

public class Truck extends Car {

    protected int power;

    public Truck(String manufacturer, String model, int weight,
                 int yearOfManufacture, boolean allWheelDrive, int power) {
        super(manufacturer, model, weight, yearOfManufacture, allWheelDrive);
        this.power = power;
    }

    @Override
    public String toString() {
        return "Bus{" + "manufacturer: " + manufacturer +
                ", model: " + model + ", weight: " + weight +
                " KG, year of manufacture: " + yearOfManufacture +
                ", has all wheel drive: " + allWheelDrive +
                ", power: " + power + " hp}";
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Truck that = (Truck) o;

        return Objects.equals(manufacturer, that.manufacturer) &&
                Objects.equals(model, that.model) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(yearOfManufacture, that.yearOfManufacture) &&
                Objects.equals(allWheelDrive, that.allWheelDrive) &&
                Objects.equals(power, that.power);
    }
}
