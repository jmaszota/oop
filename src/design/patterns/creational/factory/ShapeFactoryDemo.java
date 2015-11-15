package design.patterns.creational.factory;

/**
 * Created by jacek.maszota on 14.07.2015.
 */
public class ShapeFactoryDemo {
    public static void main(String[] args) {

        ShapeFactory  sf = new ShapeFactory();

        Shape circle = sf.createShape("Circle");
        Shape triangle = sf.createShape("Triangle");

        circle.draw();
        triangle.draw();
    }
}
