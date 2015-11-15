package design.patterns.behavioral.interpreter;

/**
 * Created by jacek.maszota on 22.07.2015.
 */
public class OneExpression extends Expression{
    public String one() { return "I"; }
    public String four(){ return "IV"; }
    public String five(){ return "V"; }
    public String nine(){ return "IX"; }
    public int multiplier() { return 1; }
}
