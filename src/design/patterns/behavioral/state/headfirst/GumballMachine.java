package design.patterns.behavioral.state.headfirst;

import design.patterns.structural.proxy.headfirst.GumballMachineRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by jacek.maszota on 07.09.2015.
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{

    private static final long serialVersionUID = 2L;

    State soldOutState;
    State noQaurterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    String location;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(String location, int numberGumballs) throws RemoteException{
        soldOutState = new SoldOutState(this);
        noQaurterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.location = location;
        this.count = numberGumballs;

        if(numberGumballs > 0){
            state = noQaurterState;
        }else
        {
            state = soldOutState;
        }
    }

    public void insertQuarter(){
        state.insertQuarterState();
    }

    public void ejectQuarter(){
        state.ejectQuarterState();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    void setState(State state){
        this.state = state;
    }

    void releaseBall(){
        System.out.println("A gumball comse rolling out the slot...");
        if(count!=0){
            count = count -1;
        }
    }

    void refill(int count){
        System.out.println("Refilling...");
        this.count += count;
        if(this.count > 0)
        {
         state.refill();
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQaurterState() {
        return noQaurterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String getLocation() throws RemoteException {
        return location;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}

