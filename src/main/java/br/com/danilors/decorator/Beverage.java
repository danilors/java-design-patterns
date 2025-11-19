package br.com.danilors.decorator;

/**
 * The Beverage interface represents the component in the Decorator pattern.
 * It defines the common interface for both concrete beverages and decorators.
 */
public interface Beverage {
    /**
     * Returns a description of the beverage.
     * @return the description of the beverage
     */
    String getDescription();

    /**
     * Calculates the cost of the beverage.
     * @return the cost of the beverage
     */
    double getCost();
}
