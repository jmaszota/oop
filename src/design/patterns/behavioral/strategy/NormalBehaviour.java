package design.patterns.behavioral.strategy;

/**
 * Created by jacek.maszota on 24.07.2015.
 */
public class NormalBehaviour implements IBehaviour {
    @Override
    public int moveCommand() {
        System.out.println("\tNormal Behaviour: if find another robot ignore it");
        return 0;
    }
}
