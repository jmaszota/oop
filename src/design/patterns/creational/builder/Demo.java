package design.patterns.creational.builder;

/**
 * Created by jacek.maszota on 09.05.2015.
 */
public class Demo {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        PizzaBuilder hawaiian_pizzabuilder = new HawaiiPizzaBuilder();
        PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( hawaiian_pizzabuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();

        System.out.println(pizza.getSauce());

    }
}
