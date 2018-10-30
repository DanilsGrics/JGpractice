package lv.danilsgrics.fourthLab;

import javax.management.ObjectName;
import java.util.Objects;

public class BoobTube {

    private int currentChannel;
    private int currentVolumeLevel;
    private String manufacturer;
    private int screenSize;
    private boolean turnedOn;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public boolean getIsTurnedOn () {
        return turnedOn;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        this.currentVolumeLevel = currentVolumeLevel;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void nextChannel () {
        currentChannel++;
    }

    public void previousChannel () {
        currentChannel--;
    }

    public void increaseVolume () {
        currentVolumeLevel++;
    }

    public void decreaseVolume () {
        currentVolumeLevel--;
    }

    public void turnOn() {
        turnedOn = true;
    }

    public void turnOff() {
        turnedOn = false;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        BoobTube that = (BoobTube) o;

        return Objects.equals(manufacturer, that.manufacturer) &&
                Objects.equals(currentChannel, that.currentChannel) &&
                Objects.equals(currentVolumeLevel, that.currentVolumeLevel) &&
                Objects.equals(screenSize, that.screenSize) &&
                Objects.equals(turnedOn, that.turnedOn);
    }

    @Override
    public String toString() {

        return "\n" + manufacturer + ":" +
                "\ncurrent channel: " + currentChannel + "\n" +
                "current volume level: " + currentVolumeLevel + "\n" +
                "screen size: " + screenSize + "\n" +
                "turned on: " + turnedOn;

    }

}
