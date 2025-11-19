package br.com.danilors.visitor;

/**
 * DocumentRenderer is a 'ConcreteVisitor' that renders different document parts.
 */
public class DocumentRenderer implements DocumentVisitor {
    /**
     * Renders a Title.
     * @param title the Title element to render
     */
    @Override
    public void visit(Title title) {
        System.out.println("Rendering Title: " + title.getText().toUpperCase());
    }

    /**
     * Renders a Paragraph.
     * @param paragraph the Paragraph element to render
     */
    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("Rendering Paragraph: " + paragraph.getText());
    }

    /**
     * Renders an Image.
     * @param image the Image element to render
     */
    @Override
    public void visit(Image image) {
        System.out.println("Rendering Image: " + image.getUrl() + " (Alt: " + image.getAltText() + ")");
    }
}
