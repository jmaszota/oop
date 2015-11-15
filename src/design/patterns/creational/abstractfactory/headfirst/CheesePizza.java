package design.patterns.creational.abstractfactory.headfirst;

/**
 * Created by jacek.maszota on 09.08.2015.
 */
public class CheesePizza extends Pizza {

    PizzaIngredientsFactory ingredientsFactory;

    public CheesePizza(PizzaIngredientsFactory ingredientsFactory) {

        this.ingredientsFactory = ingredientsFactory;

        name = "Cheese pizza (" + ingredientsFactory.getName() + ")";
    }

    @Override
    void prepare() {
            System.out.println("Preparing " + name);

            cheese = ingredientsFactory.createCheese();
            sauce = ingredientsFactory.createSauce();
            dough = ingredientsFactory.createDough();
    }

    @Override
    public void cut() {
        System.out.println("Cut in square slices");
    }
}
