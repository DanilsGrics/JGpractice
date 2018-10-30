package lv.danilsgrics.fourthLab;

public class BoobTubeTest {

    public static void main(String[] args) {

        BoobTube tv1 = new BoobTube();
        BoobTube tv2 = new BoobTube();

        tv1.setCurrentChannel(11);
        tv1.setCurrentVolumeLevel(21);
        tv1.setScreenSize(44);
        tv1.setManufacturer("Samsung");
        tv1.turnOn();

        System.out.println(tv1);

        tv1.decreaseVolume();
        tv1.nextChannel();
        tv1.turnOff();

        System.out.println(tv1);

        tv2.setCurrentChannel(31);
        tv2.setCurrentVolumeLevel(11);
        tv2.setScreenSize(55);
        tv2.setManufacturer("JVC");
        tv2.turnOn();

        System.out.println(tv2);

        System.out.println("\nIs tv1 equals to tv2: " + tv1.equals(tv2));
    }
}
