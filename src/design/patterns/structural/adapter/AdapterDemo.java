package design.patterns.structural.adapter;

/**
 * Created by jacek.maszota on 26.07.2015.
 */
public class AdapterDemo {
    public static void main(String[] args) {
        RoundHole        rh = new RoundHole( 5 );
        SquarePegAdapter spa;

        for (int i=6; i < 10; i++) {
            spa = new SquarePegAdapter( (double) i );
            // The client uses (is coupled to) the new interface
            spa.makeFit( rh );
        }
    }
}
