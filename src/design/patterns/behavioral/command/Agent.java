package design.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jacek.maszota on 21.07.2015.
 */
// Invoker.
class Agent {
    private LinkedList<Order> ordersQueue = new LinkedList();

    public Agent() {
    }

    void placeOrder(Order order) {
        ordersQueue.addLast(order);
        ordersQueue.getFirst().execute();
        ordersQueue.removeLast();
    }
}

