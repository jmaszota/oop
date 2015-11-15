package design.patterns.behavioral.templatemethod.headfirst;

/**
 * Created by jacek.maszota on 02.09.2015.
 */
public class CoffeeMachineTest {
    public static void main(String[] args) {
        CaffeineBeverage beverage = new Coffee();
        beverage.prepareRecipe();


        beverage = new Tea();
        beverage.prepareRecipe();

        beverage = new CoffeeWithHook();
        beverage.prepareRecipe();
    }
}
