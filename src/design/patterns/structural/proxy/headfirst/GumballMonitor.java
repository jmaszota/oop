package design.patterns.structural.proxy.headfirst;

import java.rmi.RemoteException;

/**
 * Created by jacek.maszota on 10.09.2015.
 */
public class GumballMonitor {
    GumballMachineRemote remoteMachine;

    public GumballMonitor(GumballMachineRemote remoteMachine) {
        this.remoteMachine = remoteMachine;
    }

    public void getReport(){
        try {
            System.out.println("Location:" + remoteMachine.getLocation());
            System.out.println("Gumballs: " + remoteMachine.getCount());
            System.out.println("State:" + remoteMachine.getState());
        }catch (RemoteException e){

        }
    }
}
