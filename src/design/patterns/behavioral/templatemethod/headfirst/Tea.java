package design.patterns.behavioral.templatemethod.headfirst;

/**
 * Created by jacek.maszota on 02.09.2015.
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
