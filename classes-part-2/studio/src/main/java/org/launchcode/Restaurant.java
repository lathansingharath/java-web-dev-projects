package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Restaurant {


    public static void main(String[] args) {
        // write your code here
        MenuItem burger = new MenuItem(15.25,"Big Mac","main course",false);
        MenuItem wrap = new MenuItem(9.14,"Chicken ceaser wrap","main course",false);
        MenuItem friedOreo = new MenuItem(9.99,"Fried oreo with a sprinkle of sugar","dessert",true);

        ArrayList <MenuItem> menuItemArr = new ArrayList<>();


        menuItemArr.add(burger);
        menuItemArr.add(wrap);
        menuItemArr.add(friedOreo);



        System.out.println(menuItemArr.contains(burger));//testing


        LocalDate lastUpdated = LocalDate.of(2024,4,11);
        Menu lathanMenu = new Menu(lastUpdated,menuItemArr);
        System.out.println("Below is our entire menu");
        System.out.println(lathanMenu);

        System.out.println("One of the items on the menu is \n" + wrap);
        menuItemArr.remove(2);
        System.out.println(menuItemArr);




    }
}
