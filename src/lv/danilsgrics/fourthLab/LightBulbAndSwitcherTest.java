package lv.danilsgrics.fourthLab;

public class LightBulbAndSwitcherTest {

    public static void main(String[] args) {

        Switcher testSwitcher = new Switcher();
        LightBulb testLightBulb = new LightBulb("Philips");

        testSwitcher.setLightBulb(testLightBulb);

        System.out.println(testSwitcher);

        testSwitcher.switchOff();
        testSwitcher.switchOn();

        System.out.println(testSwitcher);

        testSwitcher.switchOn();
        testSwitcher.switchOff();
        testSwitcher.switchOn();

        System.out.println(testSwitcher);

        testSwitcher.switchOff();

        System.out.println(testSwitcher);

        testSwitcher.switchOn();
        testSwitcher.switchOff();
        testSwitcher.switchOn();
        testSwitcher.switchOff();
        testSwitcher.switchOn();
        testSwitcher.switchOff();
        testSwitcher.switchOn();
        testSwitcher.switchOff();

        System.out.println(testSwitcher);
    }
}
