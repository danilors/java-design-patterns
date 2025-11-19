package br.com.danilors.visitor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DocumentVisitorTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testDocumentRenderer() {
        List<DocumentPart> document = Arrays.asList(
                new Title("My Awesome Document"),
                new Paragraph("This is the first paragraph of the document."),
                new Image("http://example.com/image.jpg", "An example image"),
                new Paragraph("This is the second paragraph.")
        );

        DocumentRenderer renderer = new DocumentRenderer();
        for (DocumentPart part : document) {
            part.accept(renderer);
        }

        String expectedOutput = "Rendering Title: MY AWESOME DOCUMENT\n" +
                                "Rendering Paragraph: This is the first paragraph of the document.\n" +
                                "Rendering Image: http://example.com/image.jpg (Alt: An example image)\n" +
                                "Rendering Paragraph: This is the second paragraph.\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testHtmlExportVisitor() {
        List<DocumentPart> document = Arrays.asList(
                new Title("My Awesome Document"),
                new Paragraph("This is the first paragraph of the document."),
                new Image("http://example.com/image.jpg", "An example image"),
                new Paragraph("This is the second paragraph.")
        );

        HtmlExportVisitor htmlExporter = new HtmlExportVisitor();
        for (DocumentPart part : document) {
            part.accept(htmlExporter);
        }

        String expectedHtml = "<h1>My Awesome Document</h1>\n" +
                              "<p>This is the first paragraph of the document.</p>\n" +
                              "<img src=\"http://example.com/image.jpg\" alt=\"An example image\"/>\n" +
                              "<p>This is the second paragraph.</p>\n";
        assertEquals(expectedHtml, htmlExporter.getHtmlOutput());
    }

    @Test
    void testEmptyDocument() {
        List<DocumentPart> document = Arrays.asList();
        DocumentRenderer renderer = new DocumentRenderer();
        for (DocumentPart part : document) {
            part.accept(renderer);
        }
        assertEquals("", outContent.toString());

        HtmlExportVisitor htmlExporter = new HtmlExportVisitor();
        for (DocumentPart part : document) {
            part.accept(htmlExporter);
        }
        assertEquals("", htmlExporter.getHtmlOutput());
    }
}
