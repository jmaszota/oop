package design.patterns.behavioral.iterator.headfirst;

import java.util.Calendar;
import java.util.Iterator;

/**
 * Created by jacek.maszota on 06.09.2015.
 */
public class AlternatingDinerMenuIterator implements Iterator{
    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        this.position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem item = items[position];
        position = position + 2;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("AlternatingDinerMenuIterator does not allow to remove");
    }
}
