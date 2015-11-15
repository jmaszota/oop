package design.patterns.structural.decorator.shapes;

/**
 * Created by jacek.maszota on 05.05.2015.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args){
        Shape rectangle = new Rectangle();
        Shape redRectangle = new RedShapeDecorator(rectangle);

        rectangle.draw();
        redRectangle.draw();
    }
}
