package lv.danilsgrics.fifthLab;

public class Car {

    private String manufacturer;
    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car(String manufacturer, String model, String color, int maxSpeed) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    //if color of a car was changed
    public void setColor(String color) {
        this.color = color;
    }

    //if speed limit of a car was tuned(reprogrammed)
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void accelerate() {
        if (canAccelerate()) {
            currentSpeed++;
        }
        System.out.println("Putting foot down! Current speed of " + manufacturer +
                " " + model + " is " + currentSpeed);
    }

    public void slowDown() {
        if (isDriving()) {
            currentSpeed--;
        }
        System.out.println("Time to STOP! Current speed of " + manufacturer +
                " " + model + " is " + currentSpeed);
    }

    public boolean isDriving() {
        if (currentSpeed > 0) {
            return true;
        }
        return false;
    }

    public boolean canAccelerate() {
        if (currentSpeed < maxSpeed) {
            return true;
        }
        return false;
    }

    public boolean isStopped() {
            return !isDriving();
    }

}
