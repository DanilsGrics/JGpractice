package lv.danilsgrics.fourthLab;

public class LightBulb {

    private boolean switchedOn;
    private String manufacturer;
    private int countOfPossibleActivations = 5;

    LightBulb(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void switchOn() {
        if (!isSwitchedOn() && countOfPossibleActivations > 0) {
            System.out.println("\nLightbulb switched on successfully!");
            switchedOn = true;
            countOfPossibleActivations--;
        } else {
            System.out.println("\nLightbulb is already switched on or broken!");
        }
    }

    public void switchOff() {
        if (isSwitchedOn()) {
            switchedOn = false;
            System.out.println("\nLightbulb switched off successfully!");
        } else {
            System.out.println("\nLightbulb is already switched off!");
        }
    }

    public int getCountOfPossibleActivations() {
        return countOfPossibleActivations;
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    @Override
    public String toString() {

        return manufacturer +
                "\nCount of possible activations is " + countOfPossibleActivations +
                "\nIs lightbulb switched on: " + switchedOn + "\n";
    }
}
