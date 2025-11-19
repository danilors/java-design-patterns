package br.com.danilors.factory;

/**
 * A concrete implementation of the Document interface representing a PDF document.
 */
public class PdfDocument implements Document {
    private String filename;

    public PdfDocument(String filename) {
        this.filename = filename;
        System.out.println("Creating PDF Document: " + filename);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + filename);
    }

    @Override
    public void save() {
        System.out.println("Saving PDF Document: " + filename);
    }

    @Override
    public void print() {
        System.out.println("Printing PDF Document: " + filename);
    }
}
