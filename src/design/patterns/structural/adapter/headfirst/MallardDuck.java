package design.patterns.structural.adapter.headfirst;

/**
 * Created by jacek.maszota on 26.08.2015.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quacking");
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }
}
