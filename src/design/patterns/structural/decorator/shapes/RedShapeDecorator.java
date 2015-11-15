package design.patterns.structural.decorator.shapes;

/**
 * Created by jacek.maszota on 05.05.2015.
 */
public class RedShapeDecorator extends ShapeDecorator
{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
    decoratedShape.draw();
    setRedBorder(decoratedShape);
    }


    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
