package design.patterns.creational.abstractfactory.headfirst;

import design.patterns.creational.abstractfactory.headfirst.ingredience.*;

/**
 * Created by jacek.maszota on 09.08.2015.
 */
public class ChicagoPizzaIngredientsFactory extends PizzaIngredientsFactory {

    public ChicagoPizzaIngredientsFactory() {
        name = "Chicago";
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new Chedar();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom()};
        return veggies;
    }

    @Override
    public Clams createCalms() {
        return new FrozenCalms();
    }

    @Override
    public Sauce createSauce() {
        return new Ketchup();
    }
}
