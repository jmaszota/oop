package design.patterns.behavioral.strategy.headfirst;

/**
 * Created by jacek.maszota on 31.07.2015.
 */
public class DecoyDuck extends Duck{

    public DecoyDuck() {

        this.setQuackBehaviour(new MuteQuack()); //default behaviour
        this.setFlyBehaviour(new FlyNoWay()); //default behaviour
    }

    @Override
    public void display() {
        System.out.println("I'm Marbel duck");
    }
}
