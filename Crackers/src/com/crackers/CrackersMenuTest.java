package com.crackers;

import java.util.ArrayList;

public class CrackersMenuTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        CrackersFactoryMenu crackersFactoryMenu = new CrackersFactoryMenu();
        ArrayList crackersMenu = crackersFactoryMenu.getMenuItems();


        for (int i = 0; i < crackersMenu.size(); i++) {
            CrackerItems menuItem = (CrackerItems)crackersMenu.get(i);
            System.out.print(i);
            System.out.println( ") NAME: " + menuItem.getName() + " ");
            System.out.println( "PRICE: " + menuItem.getPrice() + "(price for 20 crackers)");
            System.out.println(menuItem.getDescription());
        }


    }
}
