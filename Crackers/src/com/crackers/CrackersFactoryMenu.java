package com.crackers;

import java.util.Iterator;

public class CrackersFactoryMenu implements Menu {
    static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
    MenuItem[] menuItems;

    public CrackersFactoryMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Rtiz crackers","These are the famouse crackers all around the world",2.77);

        addItem("Cheez-IT Crackers", "These crackers are widely eaten all over the world" , 2.99);

        addItem("Anima CRackers", "These are the shaped crackers in the form of animals",2.99);


    }
    public void addItem(String name, String description, double price) {
        MenuItem menuItem = new MenuItem(name,description,price);
        if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
       
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator() {
		return new CrackersFactoryMenuIterator(menuItems);
		//return new AlternatingDinerMenuIterator(menuItems);
	}

  
}
