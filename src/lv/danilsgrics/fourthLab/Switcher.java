package lv.danilsgrics.fourthLab;

public class Switcher {

    private LightBulb lightBulb;
    private boolean switchedOn;

    public void switchOn() {
        lightBulb.switchOn();
        switchedOn = true;
    }

    public void switchOff() {
        lightBulb.switchOff();
        switchedOn = false;
    }

    public void setLightBulb(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public String toString() {

        return "\nControls bulb: " + lightBulb +
                "Is switcher switched on: " + switchedOn;
    }
}
