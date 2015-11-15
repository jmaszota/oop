package design.patterns.behavioral.iterator.headfirst;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jacek.maszota on 03.09.2015.
 */
public class DinerMenu implements Menu {

    MenuItem[] items;
    static final int MAX_ITEMS = 6;
    int numberOfItems  = 0;

    public DinerMenu() {
        items = new MenuItem[MAX_ITEMS];

        addItem("Soup", "made with water", "£13.00", true);
        addItem("Chicken", "with potato", "$10.00", false);
    }


    public void addItem(String name, String description, String price, boolean isVegenarian){
        MenuItem item = new MenuItem(name, description, price, isVegenarian);

        if(numberOfItems >= MAX_ITEMS)
        {
            System.err.println("Max 6!");
        }
        else{
            items[numberOfItems] = item;
            numberOfItems++;
        }
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(items);
    }
}
