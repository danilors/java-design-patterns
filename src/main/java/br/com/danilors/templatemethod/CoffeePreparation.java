package br.com.danilors.templatemethod;

/**
 * CoffeePreparation is a 'ConcreteClass' that implements the abstract steps
 * for preparing coffee, extending the BeveragePreparation template.
 */
public class CoffeePreparation extends BeveragePreparation {
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
