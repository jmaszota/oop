package design.patterns.creational.abstractfactory;

/**
 * Created by jacek.maszota on 15.07.2015.
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory af = FactoryMaker.getAbstractFactory("Android");
        AbstractButton ab = af.createButton();
        ab.getLabel();

        af = FactoryMaker.getAbstractFactory("Windows");
        ab = af.createButton();
        ab.getLabel();
    }
}
