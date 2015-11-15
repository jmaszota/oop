package design.patterns.behavioral.command.headfirst;

/**
 * Created by jacek.maszota on 16.08.2015.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {

        onCommands = new Command[7];
        offCommands = new Command[7];

        NonCommand nonCommand = new NonCommand();
        for(int i = 0; i < 7; i++){
            onCommands[i] = nonCommand;
            offCommands[i] = nonCommand;
        }

        undoCommand = nonCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void buttonOnPressed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void buttonOffPressed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-----------Remote Control--------------\n");
        for(int i = 0; i < 7; i++){
            stringBuffer.append("[slot " + i +"] " + onCommands[i].getClass().getSimpleName() + " " + offCommands[i].getClass().getSimpleName() + "\n");
        }

        return stringBuffer.toString();
    }
}
