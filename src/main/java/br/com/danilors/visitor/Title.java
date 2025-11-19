package br.com.danilors.visitor;

/**
 * Title is a 'ConcreteElement' that represents a title in a document.
 */
public class Title implements DocumentPart {
    private String text;

    public Title(String text) {
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
