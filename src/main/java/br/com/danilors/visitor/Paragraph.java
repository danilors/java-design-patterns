package br.com.danilors.visitor;

/**
 * Paragraph is another 'ConcreteElement' that represents a paragraph of text in a document.
 */
public class Paragraph implements DocumentPart {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    /**
     * Accepts a DocumentVisitor.
     * @param visitor the DocumentVisitor to accept
     */
    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
