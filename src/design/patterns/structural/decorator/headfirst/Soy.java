package design.patterns.structural.decorator.headfirst;

/**
 * Created by jacek.maszota on 06.08.2015.
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        switch (beverage.getSize()){
            case TALL: return beverage.cost() + 0.10;
            case GRANDE: return beverage.cost() + 0.15;
            case VENTI: return beverage.cost() + 0.30;
        }

        return beverage.cost() + .25;
    }
}
