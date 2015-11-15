package design.patterns.creational.factorymethod;

/**
 * Created by jacek.maszota on 14.07.2015.
 */
public class PlasticCar implements Toy {
    @Override
    public void printName() {
        System.out.println("Plastic Car");
    }
}
