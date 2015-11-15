package design.patterns.structural.decorator.headfirst;

/**
 * Created by jacek.maszota on 06.08.2015.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {

        switch (beverage.getSize()){
            case TALL: return beverage.cost() + 0.20;
            case GRANDE: return beverage.cost() + 0.40;
            case VENTI: return beverage.cost() + 0.50;
        }

        return beverage.cost() + .20;

    }
}
