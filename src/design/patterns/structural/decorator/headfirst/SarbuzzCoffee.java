package design.patterns.structural.decorator.headfirst;

/**
 * Created by jacek.maszota on 06.08.2015.
 */
public class SarbuzzCoffee {

    public static void main(String[] args) {
        Beverage esp = new Espresso();

        System.out.println(esp.getDescription() + " costs: " + esp.cost());

        esp = new Mocha(esp);

        System.out.println(esp.getDescription() + " costs: " + esp.cost());

        Beverage hbc = new HouseBlendCoffee();

        System.out.println(hbc.getDescription() + " costs: " + hbc.cost());

        hbc.setSize(Beverage.SIZE.VENTI);

        hbc = new Soy(hbc);

        System.out.println(hbc.getDescription() + " costs: " + hbc.cost());


        hbc.setSize(Beverage.SIZE.VENTI);

        System.out.println(hbc.getDescription() + " costs: " + hbc.cost());

    }
}
