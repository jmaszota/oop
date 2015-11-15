package design.patterns.creational.factorymethod.headfirst.simpleFactory;

import design.patterns.creational.factorymethod.headfirst.Pizza;

/**
 * Created by jacek.maszota on 09.08.2015.
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String style, String type){
        Pizza pizza = factory.createPizza(style, type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
