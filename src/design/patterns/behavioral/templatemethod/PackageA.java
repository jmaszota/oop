package design.patterns.behavioral.templatemethod;

/**
 * Created by jacek.maszota on 25.07.2015.
 */
public class PackageA extends Trip {
    public void doComingTransport() {
        System.out.println("The turists are comming by air ...");
    }
    public void doDayA() {
        System.out.println("The turists are visiting the aquarium ...");
    }
    public void doDayB() {
        System.out.println("The turists are going to the beach ...");
    }
    public void doDayC() {
        System.out.println("The turists are going to mountains ...");
    }
    public void doReturningTransport() {
        System.out.println("The turists are going home by air ...");
    }
}
