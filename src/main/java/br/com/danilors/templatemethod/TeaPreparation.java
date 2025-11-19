package br.com.danilors.templatemethod;

/**
 * TeaPreparation is another 'ConcreteClass' that implements the abstract steps
 * for preparing tea, extending the BeveragePreparation template.
 */
public class TeaPreparation extends BeveragePreparation {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea bag");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
