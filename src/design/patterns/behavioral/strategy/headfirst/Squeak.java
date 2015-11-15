package design.patterns.behavioral.strategy.headfirst;

/**
 * Created by jacek.maszota on 31.07.2015.
 */
public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I'm squeaking");
    }
}
