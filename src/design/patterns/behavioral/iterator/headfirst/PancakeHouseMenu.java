package design.patterns.behavioral.iterator.headfirst;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jacek.maszota on 03.09.2015.
 */
public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> items;

    public PancakeHouseMenu() {
        items = new ArrayList<>();

        addItem("Blueberry Pancakes", "made with fresh brueberries", "£3.00", true);
        addItem("Waffles", "with choice of blueberries or strawberries", "$10.00", true);
    }


    public void addItem(String name, String description, String price, boolean isVegenarian){
        MenuItem item = new MenuItem(name, description, price, isVegenarian);
        items.add(item);
    }

    public Iterator createIterator(){
       return items.iterator();
    }

}
