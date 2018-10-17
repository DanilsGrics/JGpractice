package lv.danilsgrics.secondLab;

public class Circle {

    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.pow(radius, 2)*Math.PI;
    }
}
