package design.patterns.creational.builder;

/**
 * Created by jacek.maszota on 09.05.2015.
 */
public class HawaiiPizzaBuilder extends  PizzaBuilder {
    @Override
    public void buildDough() {
        pizza.setDough("cross");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("mild");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("ham+pineapple");
    }
}
