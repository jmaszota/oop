package design.patterns.behavioral.command.calculator;

/**
 * Created by jacek.maszota on 21.07.2015.
 */
//receiver
public class Calculator {

    int currentValue = 0;

    public void doOperation(char operation, int operand){
        switch (operation) {
            case '+':
                currentValue += operand;
                return;
            case '-':
                currentValue -= operand;
                return;
            case '*':
                currentValue *= operand;
                return;
            case '/':
                currentValue /= operand;
                return;
        }
    }
}
