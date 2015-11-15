package design.patterns.behavioral.templatemethod.headfirst;

/**
 * Created by jacek.maszota on 02.09.2015.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
