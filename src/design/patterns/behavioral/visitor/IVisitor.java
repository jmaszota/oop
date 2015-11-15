package design.patterns.behavioral.visitor;

/**
 * Created by jacek.maszota on 25.07.2015.
 */
public interface IVisitor {
    public void visit(Customer customer);
    public void visit(Order order);
    public void visit(Item item);
}
