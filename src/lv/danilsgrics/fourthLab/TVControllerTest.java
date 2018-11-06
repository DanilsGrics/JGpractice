package lv.danilsgrics.fourthLab;

public class TVControllerTest {

    public static void main(String[] args) {

        TVController remote = new TVController();

        remote.setCurrentChannelFromRemote(11); //Will be unreal cause TV is not switched ON
        remote.turnOnFromRemote();
        remote.setCurrentChannelFromRemote(11);

        System.out.println(remote);

        remote.decreaseVolumeFromRemote();//Will be unreal cause volume is already 0
        remote.increaseVolumeFromRemote();
        remote.increaseVolumeFromRemote();
        remote.nextChannelFromRemote();

        System.out.println(remote);
    }
}
