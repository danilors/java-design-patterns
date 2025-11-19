package br.com.danilors.bridge;

/**
 * The Bridge pattern decouples an abstraction from its implementation so that the two can vary independently.
 */
public abstract class Abstraction {
    protected Implementation implementation;

    /**
     * Constructs a new Abstraction with the given implementation.
     *
     * @param implementation the implementation to use
     */
    public Abstraction(Implementation implementation) {
        this.implementation = implementation;
    }

    /**
     * Performs an operation.
     */
    public abstract void operation();
}