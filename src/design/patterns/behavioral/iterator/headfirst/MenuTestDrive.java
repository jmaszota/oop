package design.patterns.behavioral.iterator.headfirst;

import java.util.ArrayList;

/**
 * Created by jacek.maszota on 03.09.2015.
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);

        Waitress w = new Waitress(menus);

        w.printMenu();
    }
}
