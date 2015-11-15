package design.patterns.creational.singleton.headfirst;

/**
 * Created by jacek.maszota on 09.05.2015.
 */
public class EagerSingleton {

    // Private constructor prevents instantiation from other classes
    private EagerSingleton() {
        System.out.println("MySingleton() is being created");
    }

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }


    public void test(){
        System.out.println("test");
    }
}
