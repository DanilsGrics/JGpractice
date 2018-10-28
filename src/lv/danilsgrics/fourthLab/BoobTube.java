package lv.danilsgrics.fourthLab;

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

    public void setIsTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    //public int nextChannel (int nextChannel) {
//
   // }
}
