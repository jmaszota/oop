package design.patterns.creational.abstractfactory;

/**
 * Created by jacek.maszota on 15.07.2015.
 */
public class AndroidFactory extends AbstractFactory {
    @Override
    AbstractButton createButton() {
        return new AndroidButton();
    }

    @Override
    AbstractTextBox creaAbstractTextBox() {
        return new AndroidTextBox();
    }
}
