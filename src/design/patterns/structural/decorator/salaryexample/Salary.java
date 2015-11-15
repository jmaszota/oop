package design.patterns.structural.decorator.salaryexample;

/**
 * Created by jacek.maszota on 05.05.2015.
 */
public class Salary implements ITaxtCalculator {
    @Override
    public int calculate(int netvalue) {
        System.out.println("Tax free: " + netvalue);
        return netvalue;
    }
}
