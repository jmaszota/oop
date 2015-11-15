package design.patterns.structural.proxy.headfirst;

import design.patterns.behavioral.state.headfirst.GumballMachine;

import java.rmi.Naming;

/**
 * Created by jacek.maszota on 10.09.2015.
 */
public class GumballMachineRemoteTestDrive {

    public static void main(String[] args) {
        GumballMachineRemote machineRemote = null;
        int count;
        if(args.length<2){
            System.out.println("GumballMachineRemoteTestDrive <name> <inventory>");
            System.exit(1);
        }

        try{
            count = Integer.parseInt(args[1]);
            machineRemote = new GumballMachine(args[0], count);
            Naming.rebind("//"+args[0]+"/gumballMachine", machineRemote);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
