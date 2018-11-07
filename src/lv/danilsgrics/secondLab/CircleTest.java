package lv.danilsgrics.secondLab;

public class CircleTest {

    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.setRadius(3.5);

        System.out.println("The area of circle with radius " +
                circle.getRadius() + "(length units) is " + circle.calculateArea() +
                "(square units)");
    }
}
