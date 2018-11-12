package lv.danilsgrics.fourthLab;

public class TVControllerTest {

    public static void main(String[] args) {

        BoobTube tv = new BoobTube(44, "Samsung");

        TVController remote = new TVController(tv);

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
