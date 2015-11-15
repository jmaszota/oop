package design.patterns.creational.factorymethod.headfirst;

import java.util.ArrayList;

/**
 * Created by jacek.maszota on 09.08.2015.
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("tossing dough...");
        System.out.println("Adding toppings: ");
        for(String topping : toppings){
            System.out.println(" " + topping);
        }
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}