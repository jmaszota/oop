package design.patterns.behavioral.iterator.headfirst;

import java.util.Iterator;

/**
 * Created by jacek.maszota on 03.09.2015.
 */
public interface Menu {
    Iterator<MenuItem> createIterator();
}
