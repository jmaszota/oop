package design.patterns.structural.decorator.salaryexample;

/**
 * Created by jacek.maszota on 05.05.2015.
 */
public class CharityTaxDecorator extends TaxtCalculator {
    public CharityTaxDecorator(ITaxtCalculator salary) {
        super(salary);
    }

    @Override
    public int calculate(int netvalue) {
        netvalue = super.calculate(netvalue);
        System.out.println("Tax added (-1), now you will get: " + (--netvalue));
        return netvalue;
    }
}
