package design.patterns.structural.decorator.salaryexample;

/**
 * Created by jacek.maszota on 05.05.2015.
 */
public abstract class TaxtCalculator implements ITaxtCalculator {
    protected ITaxtCalculator salary;

    public TaxtCalculator(ITaxtCalculator salary){this.salary = salary;}

    public int calculate(int netvalue){
        return salary.calculate(netvalue);
    }
}
