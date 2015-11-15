package design.patterns.behavioral.iterator.headfirst;

import java.util.Iterator;

/**
 * Created by jacek.maszota on 03.09.2015.
 */
public class DinerMenuIterator implements Iterator {

    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if(position >= list.length || list[position]==null){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = list[position];
        position++;
        return  item;
    }
}
