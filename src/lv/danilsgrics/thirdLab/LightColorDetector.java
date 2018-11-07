package lv.danilsgrics.thirdLab;

public class LightColorDetector {

    public String detect(int wavelength) {

        if (wavelength >= 380 && wavelength < 450) {
            return "Violet";
        }

        if (wavelength >= 450 && wavelength < 495) {
            return "Blue";
        }

        if (wavelength >= 495 && wavelength < 570) {
            return "Green";
        }

        if (wavelength >= 570 && wavelength < 590) {
            return "Yellow";
        }

        if (wavelength >= 590 && wavelength < 620) {
            return "Orange";
        }

        if (wavelength >= 620 && wavelength <= 750) {
            return "Red";
        }

        return "not seen due to not appropriate length of wave! Light is not visible!";
    }
}
