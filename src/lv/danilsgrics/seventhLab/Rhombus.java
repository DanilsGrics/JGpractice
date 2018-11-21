package lv.danilsgrics.seventhLab;

public class Rhombus extends AbstractShape {

    protected double bigDiagonal;
    protected double smallDiagonal;

    public Rhombus(String name, String color, double bigDiagonal, double smallDiagonal) {
        super(name, color);
        this.bigDiagonal = bigDiagonal;
        this.smallDiagonal = smallDiagonal;
    }

    @Override
    public double getArea() {
        return bigDiagonal * smallDiagonal / 2;
    }

    @Override
    public String getName() {
        return name;
    }
}
