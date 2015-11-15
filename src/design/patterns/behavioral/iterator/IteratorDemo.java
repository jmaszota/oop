package design.patterns.behavioral.iterator;

/**
 * Created by jacek.maszota on 23.07.2015.
 */
public class IteratorDemo {

    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        IIterator it = collection.createIterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
