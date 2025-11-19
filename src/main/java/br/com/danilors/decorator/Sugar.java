package br.com.danilors.decorator;

/**
 * Sugar is a concrete decorator that adds sugar to a beverage.
 */
public class Sugar extends CondimentDecorator {
    /**
     * Constructs a Sugar decorator with the given beverage.
     * @param beverage the beverage to add sugar to
     */
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.10;
    }
}
