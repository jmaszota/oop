package design.patterns.behavioral.command.calculator;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by jacek.maszota on 21.07.2015.
 */
//Invoker
public class User {
    private LinkedList<Command> m_commands;
    private int m_currentCommand;
    private Calculator m_calculator;

    public User(Calculator m_calculator) {
        this.m_commands = new LinkedList<>();
        this.m_calculator = m_calculator;
    }

    public void calculate(Command command){
        command.execute();
        m_commands.add(command);
    }

    public void undo(int levels){
        for(int i = 0; i<levels;i++){
            m_commands.getLast().unexecute();
            m_commands.removeLast();
        }

    }

    public void redo(int levels){
        for(int i = 0; i<levels;i++){
            int redo = (m_commands.size()-1)-i;
            if(redo>(m_commands.size()-1) || redo < 0) return;
            m_commands.get(redo).execute();
        }
    }
}
