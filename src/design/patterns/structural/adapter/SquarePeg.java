package design.patterns.structural.adapter;

/**
 * Created by jacek.maszota on 26.07.2015.
 */
//OLD
public class SquarePeg {
    private double width;
    public SquarePeg( double w )       { width = w; }
    public double getWidth()           { return width; }
    public void   setWidth( double w ) { width = w; }
}
