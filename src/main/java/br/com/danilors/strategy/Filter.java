package br.com.danilors.strategy;

/**
 * The Strategy interface. It declares a method that the context uses to execute a strategy.
 */
public interface Filter {
    /**
     * Applies a filter to a file.
     * @param fileName The name of the file to apply the filter to.
     */
    void apply(String fileName);
}
