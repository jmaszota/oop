package design.patterns.creational.singleton;

/**
 * Created by jacek.maszota on 09.05.2015.
 */
public class MySingleton {

    // Private constructor prevents instantiation from other classes
    private MySingleton() {
        System.out.println("MySingleton() is being created");
    }

    /**
     * SingletonHolder is loaded on the first execution of Singleton.getInstance()
     * or the first access to SingletonHolder.INSTANCE, not before.
     */
    private static class SingletonHolder {
        private static final MySingleton INSTANCE = new MySingleton();
    }

    public static MySingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }


    public void test(){
        System.out.println("test");
    }
}
