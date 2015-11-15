package design.patterns.creational.factorymethod.headfirst;

/**
 * Created by jacek.maszota on 09.08.2015.
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(){
        name = "NY style cheese pizza";
        dough = "Thin crust dough";
        sauce = "Marinara sauce";

        toppings.add("Grant reggiano cheese");
    }
}
