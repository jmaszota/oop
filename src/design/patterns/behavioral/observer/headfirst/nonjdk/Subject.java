package design.patterns.behavioral.observer.headfirst.nonjdk;

/**
 * Created by jacek.maszota on 03.08.2015.
 */
public interface Subject {
    public void register(Observer o);
    public void remove(Observer o);
    public void setChanged();
    public void notifyObservers();
}
