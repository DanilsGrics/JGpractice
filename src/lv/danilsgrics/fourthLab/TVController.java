package lv.danilsgrics.fourthLab;

public class TVController {

    private BoobTube tv;

    TVController(BoobTube tv) {
        this.tv = tv;
    }

    public void nextChannelFromRemote() {
        tv.nextChannel();
    }

    public void previousChannelFromRemote() {
        tv.previousChannel();
    }

    public void increaseVolumeFromRemote() {
        tv.increaseVolume();
    }

    public void decreaseVolumeFromRemote() {
        tv.decreaseVolume();
    }

    public void setCurrentChannelFromRemote(int currentChannel) {
        tv.setCurrentChannel(currentChannel);
    }

    public void turnOnFromRemote() {
        tv.turnOn();
    }

    public void turnOffFromRemote() {
        tv.turnOff();
    }

    @Override
    public String toString() {

        return "\ncurrent channel: " + tv.getCurrentChannel() + "\n" +
                "current volume level: " + tv.getCurrentVolumeLevel() + "\n" +
                "turned on: " + tv.getIsTurnedOn();
    }
}
