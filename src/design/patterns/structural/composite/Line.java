package design.patterns.structural.composite;

/**
 *
 * Line is a basic shape that does not support adding shapes
 */
public class Line implements Shape {


    private int point1X;
    private int point2X;
    private int point1Y;
    private int point2Y;


    /**
     * Create a line between point1 and point2
     * @param point1X
     * @param point1Y
     * @param point2X
     * @param point2Y
     */
    public Line(int point1X, int point1Y, int point2X, int point2Y) {
        this.point1X = point1X;
        this.point1Y = point1Y;
        this.point2X = point2X;
        this.point2Y = point2Y;
    }

    @Override
    public Shape[] explodeShape() {


        // making a simple shape explode would return only the shape itself, there are no parts of this shape

        Shape[] shapeParts = {this};

        return shapeParts;

    }

    /**
     * this method must be implemented in this simple shape
     */
    public void renderShapeToScreen() {


        // logic to render this shape to screen
        System.out.println("Rendering: (" + this.point1X + "," + this.point1Y + "),(" + this.point2X + "," + this.point2Y + ")");

    }

}

