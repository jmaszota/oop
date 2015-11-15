package design.patterns.creational.abstractfactory.headfirst;


/**
 * Created by jacek.maszota on 09.08.2015.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("You ordered: " + pizza.getName());

        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("You ordered: " + pizza.getName());

    }
}
