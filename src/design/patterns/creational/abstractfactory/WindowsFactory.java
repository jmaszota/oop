package design.patterns.creational.abstractfactory;

/**
 * Created by jacek.maszota on 15.07.2015.
 */
public class WindowsFactory extends AbstractFactory {
    @Override
    AbstractButton createButton() {
        return new WindowsButton();
    }

    @Override
    AbstractTextBox creaAbstractTextBox() {
        return new WindowsTextBox();
    }
}
