package lv.danilsgrics.fourthLab;

public class BoobTubeTest {

    public static void main(String[] args) {

        BoobTube tv1 = new BoobTube(44, "Samsung");
        BoobTube tv2 = new BoobTube(55, "JVC");

        tv1.setCurrentChannel(11);
        tv1.turnOn();
        tv1.setCurrentChannel(11);
        tv1.increaseVolume();
        tv1.increaseVolume();

        System.out.println(tv1);

        tv1.decreaseVolume();
        tv1.nextChannel();
        tv1.turnOff();

        System.out.println(tv1);

        tv2.turnOn();
        tv2.setCurrentChannel(31);
        tv2.increaseVolume();

        System.out.println(tv2);

        System.out.println("\nIs tv1 equals to tv2: " + tv1.equals(tv2));
    }
}
