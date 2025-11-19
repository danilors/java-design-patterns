package br.com.danilors.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * The Meal class represents the complex object being built by the Builder pattern.
 * It consists of a list of items.
 */
public class Meal {
    private List<String> items = new ArrayList<>();

    /**
     * Adds an item to the meal.
     * @param item the item to add
     */
    public void addItem(String item) {
        items.add(item);
    }

    /**
     * Shows the items in the meal.
     */
    public void showItems() {
        System.out.println("Meal Items:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }

    @Override
    public String toString() {
        return "Meal{" +
                "items=" + items +
                '}';
    }
}
