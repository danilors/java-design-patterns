package br.com.danilors.decorator;

/**
 * Milk is a concrete decorator that adds milk to a beverage.
 */
public class Milk extends CondimentDecorator {
    /**
     * Constructs a Milk decorator with the given beverage.
     * @param beverage the beverage to add milk to
     */
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.50;
    }
}
