package br.com.danilors.templatemethod;

/**
 * BeveragePreparation is the 'AbstractClass' in the Template Method pattern.
 * It defines the skeleton of an algorithm for preparing a beverage,
 * deferring some steps to subclasses.
 */
public abstract class BeveragePreparation {

    /**
     * The template method that defines the steps to prepare a beverage.
     * This method is final to prevent subclasses from changing the algorithm's structure.
     */
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * Common step: boil water.
     */
    private void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * Common step: pour into cup.
     */
    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * Abstract step: brew the beverage.
     * This step must be implemented by subclasses.
     */
    protected abstract void brew();

    /**
     * Abstract step: add condiments.
     * This step must be implemented by subclasses.
     */
    protected abstract void addCondiments();
}
