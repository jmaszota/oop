package design.patterns.creational.abstractfactory;

/**
 * Created by jacek.maszota on 15.07.2015.
 */
public class AndroidButton extends AbstractButton {
    @Override
    public void getLabel() {
        System.out.println("Android Button");
    }
}
