package lv.danilsgrics.thirdLab;

public class SignComparator {

    String compare(int figure) {
        if (figure > 0) {
            return "Number is positive!";
        }

        if (figure < 0) {
            return "Number is negative!";
        }

        return "Number is equal to zero";
    }
}
