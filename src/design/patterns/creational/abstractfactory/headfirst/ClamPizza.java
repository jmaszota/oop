package design.patterns.creational.abstractfactory.headfirst;


/**
 * Created by jacek.maszota on 09.08.2015.
 */
public class ClamPizza extends Pizza {

    PizzaIngredientsFactory pizzaIngredientsFactory;

    public ClamPizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
        name = "Clam pizza";
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
    }

    @Override
    void prepare() {

        System.out.println("Preapre Clams Pizza");

        dough = pizzaIngredientsFactory.createDough();
        cheese = pizzaIngredientsFactory.createCheese();
        veggies = pizzaIngredientsFactory.createVeggies();
        clams = pizzaIngredientsFactory.createCalms();

    }
}
