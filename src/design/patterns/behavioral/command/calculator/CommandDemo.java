package design.patterns.behavioral.command.calculator;

/**
 * Created by jacek.maszota on 21.07.2015.
 */
public class CommandDemo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User invoker = new User(calculator);

        invoker.calculate(new CalculatorCommand(calculator, '+', 5));
        invoker.calculate(new CalculatorCommand(calculator, '+', 3));
        invoker.calculate(new CalculatorCommand(calculator, '-', 4));

        invoker.undo(2);
        invoker.redo(2);

        System.out.println(calculator.currentValue);

    }
}
