package br.com.danilors.factory;

/**
 * The Factory pattern provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
 */
public class Factory {
    /**
     * Creates a new product.
     *
     * @return a new product
     */
    public Product createProduct() {
        return new ConcreteProduct();
    }
}