package design.patterns.creational.abstractfactory.headfirst;

import com.sun.org.apache.bcel.internal.classfile.Unknown;
import design.patterns.creational.abstractfactory.headfirst.ingredience.*;

/**
 * Created by jacek.maszota on 09.08.2015.
 */
public abstract class PizzaIngredientsFactory {

    String name = "Unknown";
    abstract Dough createDough();
    abstract Cheese createCheese();
    abstract Veggies[] createVeggies();
    abstract Clams createCalms();
    abstract Sauce createSauce();

    public String getName() {
        return name;
    }
}
