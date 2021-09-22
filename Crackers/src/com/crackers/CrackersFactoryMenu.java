package com.crackers;

import java.util.ArrayList;

public class CrackersFactoryMenu {
    ArrayList menuItems;

    public CrackersFactoryMenu() {
        menuItems = new ArrayList();

        addItem("Rtiz crackers","These are the famouse crackers all around the world",2.77);

        addItem("Cheez-IT Crackers", "These crackers are widely eaten all over the world" , 2.99);

        addItem("Anima CRackers", "These are the shaped crackers in the form of animals",2.99);


    }
    public void addItem(String name, String description, double price) {
        CrackerItems menuItem = new CrackerItems(name,description,price);
        menuItems.add(menuItem);
    }
    public ArrayList getMenuItems() {
        return menuItems;
    }

}
