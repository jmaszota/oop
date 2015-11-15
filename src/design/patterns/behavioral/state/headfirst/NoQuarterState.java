package design.patterns.behavioral.state.headfirst;

/**
 * Created by jacek.maszota on 07.09.2015.
 */
public class NoQuarterState implements State {

    transient GumballMachine gumballMachine;
    private static final long serialVersionUID = 1L;
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarterState() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarterState() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void refill() {
        //do nothing
    }

    @Override
    public String toString() {
        return "NoQuarterState{}";
    }
}
