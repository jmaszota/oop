package design.patterns.creational.abstractfactory;

/**
 * Created by jacek.maszota on 15.07.2015.
 */
public class AndroidTextBox extends AbstractTextBox {
    @Override
    public void getText() {
        System.out.println("Android TextBox");
    }
}
