package design.patterns.behavioral.strategy.headfirst;

/**
 * Created by jacek.maszota on 31.07.2015.
 */
public class SimUDuck {
    public static void main(String[] args) {

        FlyBehaviour no = new FlyNoWay();
        FlyBehaviour withWings = new FlyWithWings();

        QuackBehaviour noQuack = new MuteQuack();
        QuackBehaviour quack = new Quack();
        QuackBehaviour squeak = new Squeak();

        Duck duck = new RedHeadDuck();
            duck.display();
            duck.performFly();
            //change behaviour
            duck.setFlyBehaviour(no);
            duck.performFly();
            duck.performQuack();


        duck = new RubberDuck();
        duck.display();
        duck.performFly();
        //change behaviour
        duck.setFlyBehaviour(withWings);
        duck.performFly();
        duck.performQuack();
    }
}
