package design.patterns.behavioral.visitor;

/**
 * Created by jacek.maszota on 25.07.2015.
 */
public interface IVisitable {
    public void accept(IVisitor visitor);
}
