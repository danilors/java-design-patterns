package br.com.danilors.visitor;

/**
 * The DocumentPart interface is the 'Element' in the Visitor pattern.
 * It defines an accept operation that takes a visitor as an argument.
 */
public interface DocumentPart {
    /**
     * Accepts a DocumentVisitor, allowing the visitor to perform an operation on this document part.
     * @param visitor the DocumentVisitor to accept
     */
    void accept(DocumentVisitor visitor);
}
