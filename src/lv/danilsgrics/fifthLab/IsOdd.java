package lv.danilsgrics.fifthLab;

public class IsOdd {

    public boolean revise(int test) {

        if (test > 1) {
            int maxDevisors = 2;
            int countOfDevisors = 1;//division on 1 is always available


            if (test > 7)
                countOfDevisors++; //to include division on itself for all numbers with more than 1 digit
            for (int i = 2; i <= 7; i++) {
                if (test % i == 0) countOfDevisors++;
            }

            if (countOfDevisors == maxDevisors) return true;
        }
        return false;
    }
}
