package design.patterns.behavioral.state.headfirst;

/**
 * Created by jacek.maszota on 07.09.2015.
 */
public class SoldState implements State {

    transient GumballMachine gumballMachine;
    private static final long serialVersionUID = 1L;
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarterState() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarterState() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQaurterState());
        }else
        {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void refill() {
        //do nothing
    }

    @Override
    public String toString() {
        return "SoldState{}";
    }
}
