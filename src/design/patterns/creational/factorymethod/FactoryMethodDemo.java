package design.patterns.creational.factorymethod;

/**
 * Created by jacek.maszota on 14.07.2015.
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        ToyFactory plasticCarFactory = new PlasticCarFactory();
        ToyFactory rubberDuckFactory = new RubberDuckFactory();

        Toy rd = rubberDuckFactory.createToy();
        Toy pc = plasticCarFactory.createToy();

        rd.printName();
        pc.printName();
    }
}
