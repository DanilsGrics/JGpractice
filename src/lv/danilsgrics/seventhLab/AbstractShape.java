package lv.danilsgrics.seventhLab;

public abstract class AbstractShape implements Shape {

    protected String name;
    protected String color;

    public AbstractShape(String name, String color) {
        this.name = name;
        this.color = color;
    }
}
