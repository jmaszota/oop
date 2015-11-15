package design.patterns.creational.abstractfactory;

/**
 * Created by jacek.maszota on 15.07.2015.
 */
public class FactoryMaker {

    private static AbstractFactory abstractFactory = null;

    public static AbstractFactory getAbstractFactory(String name){

        switch (name){
            case "Android":
                abstractFactory = new AndroidFactory();
                break;
            case "Windows":
                abstractFactory = new WindowsFactory();
                break;
            default: abstractFactory = null;
        }

        return abstractFactory;
    }
}
