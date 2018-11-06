package lv.danilsgrics.fourthLab;

import java.util.Objects;

public class BoobTube {

    private int currentChannel;
    private int currentVolumeLevel;
    private String manufacturer;
    private int screenSize;
    private boolean turnedOn;

    BoobTube(int screenSize, String manufacturer) {
        this.screenSize = screenSize;
        this.manufacturer = manufacturer;
    }

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

    public boolean getIsTurnedOn() {
        return turnedOn;
    }

    public void setCurrentChannel(int currentChannel) {

        if (turnedOn && currentChannel >= 0 && currentChannel <= 999) {
            this.currentChannel = currentChannel;
        } else {
            System.out.println("Unable to set channel!");
        }
    }

    public void nextChannel() {

        if (turnedOn) {
            currentChannel++;
        } else {
            System.out.println("TV is switched off!");
        }
    }

    public void previousChannel() {

        if (turnedOn) {
            currentChannel--;
        } else {
            System.out.println("TV is switched off!");
        }
    }

    public void increaseVolume() {

        if (turnedOn && currentVolumeLevel < 100) {
            currentVolumeLevel++;
        } else {
            System.out.println("Unable to increase volume!");
        }
    }

    public void decreaseVolume() {

        if (turnedOn && currentVolumeLevel > 0) {
            currentVolumeLevel--;
        } else {
            System.out.println("Unable to decrease volume!");
        }
    }

    public void turnOn() {

        if (turnedOn) {
            System.out.println("TV is already working!");
        } else {
            turnedOn = true;
        }
    }

    public void turnOff() {

        if (turnedOn) {
            turnedOn = false;
        } else {
            System.out.println("TV is already switched off!");
        }
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
