package design.patterns.creational.factorymethod.headfirst;

/**
 * Created by jacek.maszota on 09.08.2015.
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago style cheese pizza";
        dough = "Extra thick crust dough";
        sauce = "Tomato sauce";

        toppings.add("Mozzarella cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cut in square slices");
    }
}
