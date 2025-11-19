package br.com.danilors.visitor;

/**
 * The DocumentVisitor interface is the 'Visitor' in the Visitor pattern.
 * It declares a visit operation for each class of ConcreteElement in the object structure.
 */
public interface DocumentVisitor {
    /**
     * Visits a Title document part.
     * @param title the Title element to visit
     */
    void visit(Title title);

    /**
     * Visits a Paragraph document part.
     * @param paragraph the Paragraph element to visit
     */
    void visit(Paragraph paragraph);

    /**
     * Visits an Image document part.
     * @param image the Image element to visit
     */
    void visit(Image image);
}
