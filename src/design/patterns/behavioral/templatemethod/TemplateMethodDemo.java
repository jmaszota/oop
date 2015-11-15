package design.patterns.behavioral.templatemethod;

/**
 * Created by jacek.maszota on 25.07.2015.
 */
public class TemplateMethodDemo {
    public static void main(String[] args) {
        Trip pa = new PackageA();
        pa.performTrip();

        pa = new PackageB();
        pa.performTrip();
    }
}
