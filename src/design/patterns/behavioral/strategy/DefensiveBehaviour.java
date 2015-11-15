package design.patterns.behavioral.strategy;

/**
 * Created by jacek.maszota on 24.07.2015.
 */
public class DefensiveBehaviour implements IBehaviour {
    @Override
    public int moveCommand() {
        System.out.println("\tDefensive Behaviour: if find another robot run from it");
        return -1;
    }
}
