package lv.danilsgrics.seventhLab;

public class Rectangle extends AbstractShape {

    protected double length;
    protected double width;

    public Rectangle(String name, String color, double length, double width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getName() {
        return name;
    }
}
