package design.patterns.creational.abstractfactory.headfirst;

import design.patterns.creational.abstractfactory.headfirst.ingredience.*;

/**
 * Created by jacek.maszota on 09.08.2015.
 */
public class NYPizzaIngredientsFactory extends PizzaIngredientsFactory {

    public NYPizzaIngredientsFactory() {
        name = "NY";
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new RedPepper()};
        return veggies;
    }

    @Override
    public Clams createCalms() {
        return new FreshCalms();
    }

    @Override
    public Sauce createSauce() {
        return new GarlicSauce();
    }
}
