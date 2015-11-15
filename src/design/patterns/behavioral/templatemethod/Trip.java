package design.patterns.behavioral.templatemethod;

/**
 * Created by jacek.maszota on 25.07.2015.
 */
public abstract class Trip {
    public final void performTrip(){
        doComingTransport();
        doDayA();
        doDayB();
        doDayC();
        doReturningTransport();
    }
    public abstract void doComingTransport();
    public abstract void doDayA();
    public abstract void doDayB();
    public abstract void doDayC();
    public abstract void doReturningTransport();
}
