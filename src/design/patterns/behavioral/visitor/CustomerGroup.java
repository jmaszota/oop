package design.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jacek.maszota on 25.07.2015.
 */
public class CustomerGroup implements IVisitable {

    private ArrayList customers = new ArrayList();

    public void accept(IVisitor visitor)
    {
        for (Iterator it=customers.iterator(); it.hasNext();)
        {
            ((Customer)it.next()).accept(visitor);
        }
    }

    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }
}
