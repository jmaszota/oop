package design.patterns.structural.decorator.shapes;

/**
 * Created by jacek.maszota on 05.05.2015.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
