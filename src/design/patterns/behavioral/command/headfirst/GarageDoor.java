package design.patterns.behavioral.command.headfirst;

/**
 * Created by jacek.maszota on 16.08.2015.
 */
public class GarageDoor {

    public void up(){
        System.out.println("Door going up....");
        lightOn();
    }

    public void down(){
        System.out.println("Door going down...");
        lightOff();
    }

    public void stop(){
        System.out.println("Stop the door");
    }

    private void lightOn(){
        System.out.println("Light ON");
    }

    private void lightOff(){
        System.out.println("Light OFF");
    }
}
