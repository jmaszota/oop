package design.patterns.structural.adapter.headfirst;

/**
 * Created by jacek.maszota on 26.08.2015.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobbeling");
    }

    @Override
    public void fly() {
        System.out.println("short flying");
    }
}
