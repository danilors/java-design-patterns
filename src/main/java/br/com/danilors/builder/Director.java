package br.com.danilors.builder;

/**
 * The Builder pattern separates the construction of a complex object from its representation so that the same construction process can create different representations.
 */
public class Director {
    /**
     * Constructs a product using the given builder.
     *
     * @param builder the builder to use
     */
    public void construct(Builder builder) {
        builder.buildPart1();
        builder.buildPart2();
    }
}