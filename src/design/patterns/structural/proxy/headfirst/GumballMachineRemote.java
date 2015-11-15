package design.patterns.structural.proxy.headfirst;

import design.patterns.behavioral.state.headfirst.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by jacek.maszota on 10.09.2015.
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState()throws RemoteException;
}
