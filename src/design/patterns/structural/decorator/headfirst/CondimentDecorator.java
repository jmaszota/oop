package design.patterns.structural.decorator.headfirst;

/**
 * Created by jacek.maszota on 06.08.2015.
 */
public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract String getDescription();

    public SIZE getSize() {
        return beverage.getSize();
    }

    public void setSize(SIZE size) {
        beverage.setSize(size);
    }

}
