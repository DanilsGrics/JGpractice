package lv.danilsgrics.secondLab;

public class Product {

    String name;
    double regularPrice;
    double discount;

    public String getName() {
        return name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    double calculateActualPrice(double regularPrice, double discount) {
        return regularPrice - regularPrice * discount / 100;
    }

    public void print() {
        System.out.println("Product : name = " + this.getName() + ", regular price = " + this.getRegularPrice() +
                "EUR, discount = " + (int) this.getDiscount() + "%, actual price = " +
                calculateActualPrice(this.getRegularPrice(), this.getDiscount()) + "EUR");
    }
}
