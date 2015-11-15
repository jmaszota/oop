package design.patterns.creational.singleton;

/**
 * Created by jacek.maszota on 09.05.2015.
 */
public class SingletonDemo {

    public static void main (String[] args){

        MySingleton mySingleton = MySingleton.getInstance();

        mySingleton.test();


       MySingleton mySingleton1 = MySingleton.getInstance();

       mySingleton1.test();


    }
}
