package br.com.danilors.visitor;

/**
 * Image is another 'ConcreteElement' that represents an image in a document.
 */
public class Image implements DocumentPart {
    private String url;
    private String altText;

    public Image(String url, String altText) {
        this.url = url;
        this.altText = altText;
    }

    public String getUrl() {
        return url;
    }

    public String getAltText() {
        return altText;
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
