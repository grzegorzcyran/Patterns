package edu.grcy.patterns.creational.prototype;

import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args) {
        //szablon z listą zakupów
        ShoppingList template = new ShoppingList();


        try {
            ShoppingList monday = (ShoppingList) template.clone();
            List<String> mondayShoppings = monday.getShoppingList();
            mondayShoppings.add("Sok pomidorowy");
            mondayShoppings.add("Wysowianka");
            monday.setShoppingList(mondayShoppings);

            ShoppingList wednesday = (ShoppingList) template.clone();
            List<String> wednasdayShoppings = monday.getShoppingList();
            wednasdayShoppings.add("Brokuł");
            wednasdayShoppings.add("Ser feta");
            wednasdayShoppings.remove("Chleb");
            monday.setShoppingList(wednasdayShoppings);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
