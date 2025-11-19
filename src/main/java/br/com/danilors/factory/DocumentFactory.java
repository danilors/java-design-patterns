package br.com.danilors.factory;

/**
 * The DocumentFactory is a Factory Method pattern implementation that provides a method
 * for creating different types of Document objects (e.g., PDF, Word).
 * This allows subclasses to decide which concrete Document to instantiate.
 */
public class DocumentFactory {

    /**
     * Creates a new Document object based on the specified type and filename.
     * This is the 'Factory Method'.
     *
     * @param type the type of document to create (e.g., "pdf", "word")
     * @param filename the name of the document file
     * @return a new Document instance of the specified type.
     * @throws IllegalArgumentException if the document type is null, empty, or unknown.
     */
    public Document createDocument(String type, String filename) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Document type cannot be null or empty.");
        }
        switch (type.toLowerCase()) {
            case "pdf":
                return new PdfDocument(filename);
            case "word":
                return new WordDocument(filename);
            default:
                throw new IllegalArgumentException("Unknown document type: " + type);
        }
    }
}
