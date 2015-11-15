package design.patterns.creational.builder;

/**
 * Created by jacek.maszota on 09.05.2015.
 */
public abstract class PizzaBuilder {

    protected  Pizza pizza;

    public void createNewPizza(){this.pizza = new Pizza();}
    public Pizza getPizza() {return pizza;}

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}



