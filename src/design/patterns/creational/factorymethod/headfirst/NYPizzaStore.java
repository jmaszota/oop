package design.patterns.creational.factorymethod.headfirst;

/**
 * Created by jacek.maszota on 09.08.2015.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }

        return null;
    }
}
