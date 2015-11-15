package design.patterns.behavioral.strategy.headfirst;

/**
 * Created by jacek.maszota on 31.07.2015.
 */
public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
