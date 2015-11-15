package design.patterns.behavioral.command.headfirst;

/**
 * Created by jacek.maszota on 16.08.2015.
 */
public class SimpleRemoteControl {
    Command slot;
    
    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
