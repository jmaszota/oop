package design.patterns.structural.composite.headfirst;

import java.util.Iterator;

/**
 * Created by jacek.maszota on 06.09.2015.
 */
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
