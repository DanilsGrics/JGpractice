package lv.danilsgrics.seventhLab;

public class Triangle extends AbstractShape {

    protected double altitude;
    protected double side;

    public Triangle(String name, String color, double altitude, double side) {
        super(name, color);
        this.altitude = altitude;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * altitude / 2;
    }

    @Override
    public String getName() {
        return name;
    }
}
