package br.com.danilors.factory;

/**
 * The Document interface represents a generic document that can be opened, saved, and printed.
 * This is the 'Product' in the Factory Method pattern.
 */
public interface Document {
    /**
     * Opens the document.
     */
    void open();

    /**
     * Saves the document.
     */
    void save();

    /**
     * Prints the document.
     */
    void print();
}
