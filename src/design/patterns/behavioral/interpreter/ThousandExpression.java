package design.patterns.behavioral.interpreter;

/**
 * Created by jacek.maszota on 22.07.2015.
 */
public class ThousandExpression extends Expression {
    public String one() { return "M"; }
    public String four(){ return " "; }
    public String five(){ return " "; }
    public String nine(){ return " "; }
    public int multiplier() { return 1000; }
}
