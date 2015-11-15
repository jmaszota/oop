package design.patterns.creational.factorymethod;

/**
 * Created by jacek.maszota on 14.07.2015.
 */
public class RubberDuck implements Toy {
    @Override
    public void printName() {
        System.out.println("Rubber Duck");
    }
}
