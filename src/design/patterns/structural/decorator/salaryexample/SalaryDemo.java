package design.patterns.structural.decorator.salaryexample;

/**
 * Created by jacek.maszota on 05.05.2015.
 */
public class SalaryDemo {

    public static void main(String[] args){

        ITaxtCalculator salary = new Salary();

//        System.out.println("Calculate basic salary for 2000");
//        salary.calculate(2000);
//
//        System.out.println("Calculate with taxes");
//        new TaxtCalculatorLevel1(salary).calculate(2000);


        System.out.println("Taxt & Charity");
        new CharityTaxDecorator(new TaxtCalculatorLevel1(salary)).calculate(2000);
    }
}
