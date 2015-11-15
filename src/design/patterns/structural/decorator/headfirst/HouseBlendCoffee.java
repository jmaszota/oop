package design.patterns.structural.decorator.headfirst;

/**
 * Created by jacek.maszota on 06.08.2015.
 */
public class HouseBlendCoffee extends Beverage {

    @Override
    public String getDescription() {
        return "House Blend Coffee, size:" + getSize();
    }

    @Override
    public double cost() {
        double base = .99;

        switch (getSize()){
            case TALL: return base + 0.20;
            case GRANDE: return base + 0.40;
            case VENTI: return base + 0.50;
        }

        return base;
    }
}
