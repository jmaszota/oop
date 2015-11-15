package design.patterns.structural.proxy.headfirst;

import design.patterns.behavioral.state.headfirst.GumballMachine;

import java.rmi.Naming;

/**
 * Created by jacek.maszota on 10.09.2015.
 */
public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String location = "rmi://127.0.0.1/gumballMachine";
        try {
            GumballMachineRemote machineRemote = (GumballMachineRemote) Naming.lookup(location);
            GumballMonitor monitor = new GumballMonitor(machineRemote);
            System.out.println(monitor);
            monitor.getReport();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
