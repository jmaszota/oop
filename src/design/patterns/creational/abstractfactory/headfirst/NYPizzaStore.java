package design.patterns.creational.abstractfactory.headfirst;

/**
 * Created by jacek.maszota on 09.08.2015.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientsFactory ingredientsFactory = new NYPizzaIngredientsFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientsFactory);
        }else if(type.equals("clams")){
            pizza = new ClamPizza(ingredientsFactory);
        }

        return pizza;
    }
}
