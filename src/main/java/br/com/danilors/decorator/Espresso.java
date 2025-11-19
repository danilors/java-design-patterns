package br.com.danilors.decorator;

/**
 * Espresso is a concrete implementation of Beverage, representing a basic coffee.
 */
public class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}
