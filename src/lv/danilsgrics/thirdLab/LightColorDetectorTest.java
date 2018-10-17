package lv.danilsgrics.thirdLab;

import java.util.Scanner;

public class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetector lightColorDetector = new LightColorDetector();
        Scanner scan = new Scanner(System.in);
        int wavelength;

        System.out.print("Input length of wave in nanometres, please: ");
        wavelength = scan.nextInt();

        System.out.println("\nThe colour is " + lightColorDetector.detect(wavelength));
    }
}
