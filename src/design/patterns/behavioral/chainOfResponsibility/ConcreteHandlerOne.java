package design.patterns.behavioral.chainOfResponsibility;

/**
 * Created by jacek.maszota on 16.07.2015.
 */
public class ConcreteHandlerOne extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getValue() < 0)
        {           //if request is eligible handle it
            System.out.println("Negative values are handled by ConcreteHandlerOne:");
            System.out.println("\tConcreteHandlerOne.HandleRequest : " + request.getDescription()
                    + request.getValue());
        }
        else
        {
            super.m_successor.handleRequest(request);
        }
    }
}
