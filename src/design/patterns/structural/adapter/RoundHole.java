package design.patterns.structural.adapter;

/**
 * Created by jacek.maszota on 26.07.2015.
 */
//NEW
public class RoundHole {
    private int radius;
    public RoundHole( int r ) {
        radius = r;
        System.out.println( "RoundHole: max SquarePeg is " + r * Math.sqrt(2) );
    }
    public int getRadius() { return radius; }
}
