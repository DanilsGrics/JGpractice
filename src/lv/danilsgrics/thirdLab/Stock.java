package lv.danilsgrics.thirdLab;

public class Stock {

    String company;
    double currentValue;
    double max;
    double min;

    Stock (String tempCompany, double tempCurrentValue) {
        company = tempCompany;
        currentValue = tempCurrentValue;
    }


    public void updatePrice (double newPrice) {
        if (newPrice > 0) {

            currentValue = newPrice;
            if (newPrice > max) {
                max = newPrice;
            }

            if (newPrice < min) {
                min = newPrice;
            }

            System.out.println("Current price of " + this.company + " stock is updated succesfully!");
            this.printInfo();
        }

        else {
            System.out.println("Error, new value of " + this.company + " stock cannot be negative or be equivalent to zero!\n");
        }
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public double getMax() {
        if (max == 0) {
            max = currentValue;
        }

        return max;
    }

    public double getMin() {
        if (min == 0) {
            min = currentValue;
        }

        return min;
    }

    public void printInfo () {
        System.out.println("Information about " + this.company + " stock\n" +
                "Current value: " + this.getCurrentValue() + "\nMaximal value: " + this.getMax() +
                "\nMinimal value: " + this.getMin() + "\n");
    }
}
