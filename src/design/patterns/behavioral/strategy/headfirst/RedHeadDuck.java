package design.patterns.behavioral.strategy.headfirst;

/**
 * Created by jacek.maszota on 31.07.2015.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        this.setQuackBehaviour(new Quack()); //default behaviour
        this.setFlyBehaviour(new FlyWithWings()); //default behaviour
    }

    @Override
    public void display() {
        System.out.println("I'm Red head duck");
    }
}
