package design.patterns.structural.adapter.headfirst;

/**
 * Created by jacek.maszota on 26.08.2015.
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0 ; i < 5; i++){
            turkey.fly();
        }
    }
}
