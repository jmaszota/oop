package design.patterns.behavioral.command.calculator;

/**
 * Created by jacek.maszota on 21.07.2015.
 */
//command
public class CalculatorCommand implements Command {
    private Calculator m_Calculator;
    private char m_operator;
    private int m_operand;


    public CalculatorCommand(Calculator m_Calculator, char m_operator, int m_operand) {
        this.m_Calculator = m_Calculator;
        this.m_operator = m_operator;
        this.m_operand = m_operand;
    }

    @Override
    public void execute(){
        m_Calculator.doOperation(m_operator,m_operand);
    }

    @Override
    public  void unexecute(){
        m_Calculator.doOperation(getUndo(m_operator),m_operand);
    }

    public char getUndo(char operator){
        switch (operator) {
            case '+':
                return '-';
            case '-':
                return '+';
            case '*':
                return '/';
            case '/':
                return '*';
        }
        return ' ';
    }

}
