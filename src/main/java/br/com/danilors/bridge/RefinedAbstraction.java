package br.com.danilors.bridge;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementation implementation) {
        super(implementation);
    }

    @Override
    public void operation() {
        implementation.operationImplementation();
    }
}