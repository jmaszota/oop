package design.patterns.structural.composite.headfirst;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jacek.maszota on 06.09.2015.
 */
public class Menu extends MenuComponent {

    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;
    Iterator<MenuComponent> iterator = null;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        if(iterator==null){
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("-------------------------------------");

        Iterator<MenuComponent> iterator = menuComponents.iterator();

        while (iterator.hasNext()){
            MenuComponent component = iterator.next();
            component.print();
        }
    }
}
