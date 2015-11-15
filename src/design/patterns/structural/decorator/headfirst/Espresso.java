package design.patterns.structural.decorator.headfirst;

/**
 * Created by jacek.maszota on 06.08.2015.
 */
public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso, size:" + getSize();
    }

    @Override
    public double cost() {

        double base = 1.99;

        switch (getSize()){
            case TALL: return base + 0.20;
            case GRANDE: return base + 0.40;
            case VENTI: return base + 0.50;
        }

        return base;
    }
}
