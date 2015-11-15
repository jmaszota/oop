package design.patterns.structural.composite.headfirst;

import java.util.Iterator;

/**
 * Created by jacek.maszota on 06.09.2015.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void print(){
        this.allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = this.allMenus.createIterator();
        System.out.println("VEGETARIAN MENU");
        while (iterator.hasNext()) {
            MenuComponent component = iterator.next();
            try {
                if (component.isVegetarian()) {
                    component.print();
                }
            } catch (UnsupportedOperationException uoe) {
                //
            }
        }
    }
}
