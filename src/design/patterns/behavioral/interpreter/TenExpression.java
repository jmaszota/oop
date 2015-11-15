package design.patterns.behavioral.interpreter;

/**
 * Created by jacek.maszota on 22.07.2015.
 */
public class TenExpression extends Expression {
    public String one() { return "X"; }
    public String four(){ return "XL"; }
    public String five(){ return "L"; }
    public String nine(){ return "XC"; }
    public int multiplier() { return 10; }
}
