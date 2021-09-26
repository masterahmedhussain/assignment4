package com.crackers;

import java.util.ArrayList;

public class CrackersMenuTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        CrackersFactoryMenu crackersFactoryMenu = new CrackersFactoryMenu();
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(crackersFactoryMenu);

        Manager manager = new Manager(menus);
		manager.printMenu();


    }
}
