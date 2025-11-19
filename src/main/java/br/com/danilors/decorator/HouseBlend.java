package br.com.danilors.decorator;

/**
 * HouseBlend is another concrete implementation of Beverage, representing a different type of coffee.
 */
public class HouseBlend implements Beverage {
    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public double getCost() {
        return 0.89;
    }
}
