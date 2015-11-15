package design.patterns.creational.factorymethod;

/**
 * Created by jacek.maszota on 14.07.2015.
 */
public class PlasticCarFactory extends ToyFactory {
    @Override
    public Toy createToy() {
        return new PlasticCar();
    }
}
