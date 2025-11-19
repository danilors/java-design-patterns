package br.com.danilors.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DocumentFactoryTest {

    @Test
    void testCreatePdfDocument() {
        DocumentFactory factory = new DocumentFactory();
        Document pdfDocument = factory.createDocument("pdf", "report.pdf");

        assertNotNull(pdfDocument, "PDF Document should not be null");
        assertTrue(pdfDocument instanceof PdfDocument, "Document should be an instance of PdfDocument");

        // You can also call methods to ensure they exist and don't throw exceptions
        pdfDocument.open();
        pdfDocument.save();
        pdfDocument.print();
    }

    @Test
    void testCreateWordDocument() {
        DocumentFactory factory = new DocumentFactory();
        Document wordDocument = factory.createDocument("word", "memo.docx");

        assertNotNull(wordDocument, "Word Document should not be null");
        assertTrue(wordDocument instanceof WordDocument, "Document should be an instance of WordDocument");

        wordDocument.open();
        wordDocument.save();
        wordDocument.print();
    }

    @Test
    void testCreateUnknownDocumentType() {
        DocumentFactory factory = new DocumentFactory();
        assertThrows(IllegalArgumentException.class, () -> {
            factory.createDocument("excel", "spreadsheet.xlsx");
        }, "Should throw IllegalArgumentException for unknown document type");
    }

    @Test
    void testCreateNullDocumentType() {
        DocumentFactory factory = new DocumentFactory();
        assertThrows(IllegalArgumentException.class, () -> {
            factory.createDocument(null, "test.txt");
        }, "Should throw IllegalArgumentException for null document type");
    }

    @Test
    void testCreateEmptyDocumentType() {
        DocumentFactory factory = new DocumentFactory();
        assertThrows(IllegalArgumentException.class, () -> {
            factory.createDocument("", "test.txt");
        }, "Should throw IllegalArgumentException for empty document type");
    }
}
