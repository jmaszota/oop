package design.patterns.behavioral.interpreter;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jacek.maszota on 22.07.2015.
 */
public class InterpreterDemo {
    /**
     * Main(Client) - In our litle example this class is responsible to build the syntax tree representing a specific sentence in the language defined by the grammar.
     * After the syntax tree is build the main method is invoking the interpret method.
     * @param args
     */
    public static void main(String[] args) {

        String roman = "MCMXXVIII";
        /**
         * Context - keeps the current string that has to be parsed and the decimal that contains the conversion already done.
         * Initially the context keeps the full string that has to be converted and 0 for the output decimal.
         */
        Context context = new Context(roman);

        /**
         * Expression - Consists of the interpret method which receives the context. Based on the current object it uses specific values for Thousand, Hundred, Ten, One and a specific multiplier.
         */
        // Build the 'parse tree'
        ArrayList<Expression> tree = new ArrayList<Expression>();

        /**
         * ThousandExpression, HundredExpression, TenExpression, OneExpression (TerminalExpression) - Those classes are usued to define each specific expression.
         * Ussualy, the TerminalExpression classes implement the interpret method. In our case the method is already defined in the base Expression class and each TerminalExpression class defines
         * its behaviour by implmenting the abstract methods: one, four(), five(), nine(), multiplier(). It is a template method pattern.
         */
        tree.add(new ThousandExpression());
        tree.add(new HundredExpression());
        tree.add(new TenExpression());
        tree.add(new OneExpression());


        // Interpret
        for (Iterator it = tree.iterator(); it.hasNext();)
        {
            Expression exp = (Expression)it.next();
            exp.interpret(context);
        }

        System.out.println(roman + " = " + Integer.toString(context.getOutput()));

    }
}
