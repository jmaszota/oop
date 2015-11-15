package design.patterns.behavioral.state.headfirst;

import java.io.Serializable;

/**
 * Created by jacek.maszota on 07.09.2015.
 */
public interface State extends Serializable {
    public void insertQuarterState();
    public void ejectQuarterState();
    public void turnCrank();
    public void dispense();
    public void refill();
}
