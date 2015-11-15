package design.patterns.creational.prototype;

/**
 * Created by jacek.maszota on 15.07.2015.
 */
public interface PrototypeCapable extends Cloneable {
    public PrototypeCapable clone() throws CloneNotSupportedException;
}
