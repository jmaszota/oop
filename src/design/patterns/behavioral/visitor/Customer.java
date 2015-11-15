package design.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jacek.maszota on 25.07.2015.
 */
public class Customer implements IVisitable {
    private String name;

    private ArrayList orders = new ArrayList();

    public void accept(IVisitor visitor)
    {
        visitor.visit(this);

        for (Iterator it=orders.iterator(); it.hasNext();)
        {
            ((IVisitable)it.next()).accept(visitor);
        }
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void addOrder(Order order)
    {
        orders.add(order);
    }


    public Customer(String name)
    {
        this.name = name;
    }
}
