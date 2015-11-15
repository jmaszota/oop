package design.patterns.structural.composite.headfirst;

import java.util.Iterator;

/**
 * Created by jacek.maszota on 06.09.2015.
 */
public abstract class MenuComponent {

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw  new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw  new UnsupportedOperationException();
    }

    public String getName(){
        throw  new UnsupportedOperationException();
    }

    public String getDescription(){
        throw  new UnsupportedOperationException();
    }

    public double getPrice(){
        throw  new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw  new UnsupportedOperationException();
    }

    public void print(){
        throw  new UnsupportedOperationException();
    }

    public Iterator<MenuComponent> createIterator(){
        throw new UnsupportedOperationException();
    }
}
