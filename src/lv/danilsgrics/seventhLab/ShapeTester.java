package lv.danilsgrics.seventhLab;

public class ShapeTester {

    public static void main(String[] args) {


        Shape[] shapes = {new Circle("Handsome Circle", "red", 2.3),
                new Rectangle("Huge Rectangle", "black", 125.6, 34.7),
                new Triangle("Terrible Triangle", "yellow", 23.5, 178.8),
                new Rhombus("Tiny Rhombus", "white", 0.54, 0.674)};

        for (Shape shape : shapes) {
            String name = shape.getName();
            double area = shape.getArea();
            System.out.println(name + ", area: " + area + " area units");
        }

    }
}
