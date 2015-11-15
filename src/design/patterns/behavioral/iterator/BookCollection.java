package design.patterns.behavioral.iterator;

/**
 * Created by jacek.maszota on 23.07.2015.
 */
public class BookCollection implements IContainer {

    private String m_titles[] = {"Design Patterns","1","2","3","4"};

    @Override
    public IIterator createIterator() {
        BookIterator result = new BookIterator();
        return  result;
    }

    private class BookIterator implements IIterator{

        private int m_position;

        @Override
        public boolean hasNext() {
            if (m_position < m_titles.length)
                return true;
            else
                return false;
        }

        @Override
        public Object next() {
            if (this.hasNext())
                return m_titles[m_position++];
            else
                return null;
        }
    }
}
