package design.patterns.structural.adapter.headfirst;

/**
 * Created by jacek.maszota on 26.08.2015.
 */
public class AdapterTest {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        Duck duck1 = new TurkeyAdapter(turkey);

        System.out.println("Turkey says:");
        turkey.fly();
        turkey.gobble();

        System.out.println("Duck says:");
        testDuck(duck);

        System.out.println("Turkey says:");
        testDuck(duck1);
    }

    static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}
