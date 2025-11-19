package br.com.danilors.factory;

/**
 * A concrete implementation of the Document interface representing a Word document.
 */
public class WordDocument implements Document {
    private String filename;

    public WordDocument(String filename) {
        this.filename = filename;
        System.out.println("Creating Word Document: " + filename);
    }

    @Override
    public void open() {
        System.out.println("Opening Word Document: " + filename);
    }

    @Override
    public void save() {
        System.out.println("Saving Word Document: " + filename);
    }

    @Override
    public void print() {
        System.out.println("Printing Word Document: " + filename);
    }
}
