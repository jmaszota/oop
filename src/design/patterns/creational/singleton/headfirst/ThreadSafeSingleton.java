package design.patterns.creational.singleton.headfirst;

/**
 * Created by jacek.maszota on 15.08.2015.
 */
public class ThreadSafeSingleton {
    // Private constructor prevents instantiation from other classes
    private ThreadSafeSingleton() {
        System.out.println("MySingleton() is being created");
    }

    private static ThreadSafeSingleton INSTANCE = null;

    public synchronized static ThreadSafeSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ThreadSafeSingleton();
        }

        return INSTANCE;
    }

    public void test(){
        System.out.println("test");
    }
}
