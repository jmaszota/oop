package design.patterns.creational.factorymethod.headfirst.simpleFactory;

import design.patterns.creational.factorymethod.headfirst.ChicagoStyleCheesePizza;
import design.patterns.creational.factorymethod.headfirst.NYStyleCheesePizza;
import design.patterns.creational.factorymethod.headfirst.Pizza;

/**
 * Created by jacek.maszota on 09.08.2015.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("NY")) {
            if (type.equals("cheese")) {
                pizza = new NYStyleCheesePizza();
            } else if (type.equals("hawaii")) {

            }
        } else if (style.equals("Chicago")) {
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
