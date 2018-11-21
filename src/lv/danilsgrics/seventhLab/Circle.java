package lv.danilsgrics.seventhLab;

public class Circle extends AbstractShape {

    protected double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.sqrt(Math.PI) * radius;
    }

    @Override
    public String getName() {
        return name;
    }
}
