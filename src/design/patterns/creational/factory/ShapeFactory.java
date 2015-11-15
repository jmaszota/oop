package design.patterns.creational.factory;

/**
 * Created by jacek.maszota on 14.07.2015.
 */
public class ShapeFactory {

    public Shape createShape(String shapeName) {
        if ("Circle".equals(shapeName)) {
            return new Circle();
        } else if ("Triangle".equals(shapeName)) {
            return new Triangle();
        }
        return null;
    }
}
