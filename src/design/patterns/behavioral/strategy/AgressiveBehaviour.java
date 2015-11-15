package design.patterns.behavioral.strategy;

/**
 * Created by jacek.maszota on 24.07.2015.
 */
public class AgressiveBehaviour implements IBehaviour {
    @Override
    public int moveCommand() {
        System.out.println("\tAgressive Behaviour: if find another robot attack it");
        return 1;
    }
}
