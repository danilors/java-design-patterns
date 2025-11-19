package br.com.danilors.visitor;

/**
 * HtmlExportVisitor is another 'ConcreteVisitor' that exports document parts to HTML format.
 */
public class HtmlExportVisitor implements DocumentVisitor {
    private StringBuilder htmlOutput = new StringBuilder();

    /**
     * Exports a Title to HTML.
     * @param title the Title element to export
     */
    @Override
    public void visit(Title title) {
        htmlOutput.append("<h1>").append(title.getText()).append("</h1>\n");
    }

    /**
     * Exports a Paragraph to HTML.
     * @param paragraph the Paragraph element to export
     */
    @Override
    public void visit(Paragraph paragraph) {
        htmlOutput.append("<p>").append(paragraph.getText()).append("</p>\n");
    }

    /**
     * Exports an Image to HTML.
     * @param image the Image element to export
     */
    @Override
    public void visit(Image image) {
        htmlOutput.append("<img src=\"").append(image.getUrl()).append("\" alt=\"").append(image.getAltText()).append("\"/>\n");
    }

    /**
     * Returns the generated HTML output.
     * @return the HTML string
     */
    public String getHtmlOutput() {
        return htmlOutput.toString();
    }
}
