package br.com.danilors.templatemethod;

/**
 * The Template Method pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
 */
public abstract class AbstractClass {
    /**
     * The template method defines the algorithm's skeleton.
     */
    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }

    /**
     * Primitive operation 1, to be implemented by subclasses.
     */
    protected abstract void primitiveOperation1();
    /**
     * Primitive operation 2, to be implemented by subclasses.
     */
    protected abstract void primitiveOperation2();
}