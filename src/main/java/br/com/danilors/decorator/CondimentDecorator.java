package br.com.danilors.decorator;

/**
 * CondimentDecorator is the abstract decorator class in the Decorator pattern.
 * It extends Beverage, allowing condiments to be added to any beverage.
 */
public abstract class CondimentDecorator implements Beverage {
    protected Beverage beverage; // The beverage being decorated

    /**
     * Constructs a CondimentDecorator with the given beverage.
     * @param beverage the beverage to decorate
     */
    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * All condiment decorators must implement getDescription().
     * @return the description of the beverage with condiments
     */
    public abstract String getDescription();
}
