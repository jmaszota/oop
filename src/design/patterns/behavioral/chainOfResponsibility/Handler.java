package design.patterns.behavioral.chainOfResponsibility;

/**
 * Created by jacek.maszota on 16.07.2015.
 */
public abstract class Handler {
    protected Handler m_successor;

    public void setM_successor(Handler m_successor) {
        this.m_successor = m_successor;
    }

    public abstract void handleRequest(Request request);
}
