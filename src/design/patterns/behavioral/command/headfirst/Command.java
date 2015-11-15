package design.patterns.behavioral.command.headfirst;

/**
 * Created by jacek.maszota on 16.08.2015.
 */
public interface Command {
    public void execute();
    public void undo();
}
