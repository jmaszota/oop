package design.patterns.structural.composite.headfirst;

/**
 * Created by jacek.maszota on 06.09.2015.
 */
public class CompositeMenuTestDrive {
    public static void main(String[] args) {
        MenuComponent breakfast = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent diner = new Menu("DINER MENU", "Lunch");
        MenuComponent cafe = new Menu("CAFE MENU", "Diner");
        MenuComponent dessert = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(breakfast);
        allMenus.add(diner);
        allMenus.add(cafe);
        allMenus.add(dessert);

        //testCompositeIterator(allMenus);

        diner.add(new MenuItem("Pasta", "Spaghetti with Marinara", true, 3.89));

        Waitress waitress = new Waitress(allMenus);
        waitress.print();
        waitress.printVegetarianMenu();

    }

    public static void testCompositeIterator(MenuComponent component) {
        CompositeIterator iterator = new CompositeIterator(component.createIterator());

        while(iterator.hasNext()) {
            MenuComponent componentTemp = (MenuComponent) iterator.next();
        }
    }
}
