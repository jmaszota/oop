package design.patterns.behavioral.state.headfirst;

import java.rmi.RemoteException;

/**
 * Created by jacek.maszota on 07.09.2015.
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) throws RemoteException {
        //GumballMachineWithoutPattern gumballMachine = new GumballMachineWithoutPattern(5);
        GumballMachine gumballMachine = new GumballMachine(null, 5);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.refill(50);
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
