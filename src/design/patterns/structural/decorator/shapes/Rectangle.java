package design.patterns.structural.decorator.shapes;

/**
 * Created by jacek.maszota on 05.05.2015.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
