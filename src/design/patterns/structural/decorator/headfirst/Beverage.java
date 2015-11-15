package design.patterns.structural.decorator.headfirst;

/**
 * Created by jacek.maszota on 06.08.2015.
 */
public abstract class Beverage {

    public enum SIZE {TALL, GRANDE, VENTI};

    SIZE Size = SIZE.TALL;

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public SIZE getSize() {
        return Size;
    }

    public void setSize(SIZE size) {
        Size = size;
    }
}
