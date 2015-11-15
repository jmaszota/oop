package design.patterns.behavioral.iterator.headfirst;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jacek.maszota on 03.09.2015.
 */
public class Waitress {
   ArrayList<Menu> menus;


    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu(){
        Iterator<Menu>iterator = menus.iterator();
        while (iterator.hasNext()){
            Menu menu = iterator.next();
            printMenu(menu.createIterator());
        }
    }


    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.print(item.getName() + ",");
            System.out.print(item.getPrice()+"---");
            System.out.println(item.getDescription());
        }
    }
}
