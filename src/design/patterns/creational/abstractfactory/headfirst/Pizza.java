package design.patterns.creational.abstractfactory.headfirst;

import design.patterns.creational.abstractfactory.headfirst.ingredience.*;

import java.util.ArrayList;

/**
 * Created by jacek.maszota on 09.08.2015.
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Clams clams;

    abstract void prepare();

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
