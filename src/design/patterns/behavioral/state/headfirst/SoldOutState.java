package design.patterns.behavioral.state.headfirst;

/**
 * Created by jacek.maszota on 07.09.2015.
 */
public class SoldOutState implements State {

    transient GumballMachine gumballMachine;
    private static final long serialVersionUID = 1L;
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarterState() {
        System.out.println(" You can't insert a quarter, machine is sold out");
    }

    @Override
    public void ejectQuarterState() {
        System.out.println("You can't eject, you haven't inserted quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQaurterState());
    }

    @Override
    public String toString() {
        return "SoldOutState{}";
    }
}
