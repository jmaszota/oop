package design.patterns.behavioral.strategy.headfirst;

/**
 * Created by jacek.maszota on 31.07.2015.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        this.setQuackBehaviour(new Squeak()); //default behaviour
        this.setFlyBehaviour(new FlyNoWay()); //default behaviour
    }

    @Override
    public void display() {
        System.out.println("I'm Rubber duck");
    }
}
