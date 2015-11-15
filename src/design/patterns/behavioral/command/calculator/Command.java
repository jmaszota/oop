package design.patterns.behavioral.command.calculator;

/**
 * Created by jacek.maszota on 21.07.2015.
 */
//Command
public interface Command {
    void execute();

    void unexecute();
}
