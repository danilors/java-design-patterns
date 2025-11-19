package br.com.danilors.prototype;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ShapePrototypeTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        ShapeCache.loadCache(); // Load initial shapes before each test
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testGetClonedCircle() {
        Shape clonedCircle = ShapeCache.getShape("1"); // ID for Circle
        assertNotNull(clonedCircle);
        assertEquals("Circle", clonedCircle.getType());
        assertEquals("1", clonedCircle.getId());
        assertNotSame(ShapeCache.shapeMap.get("1"), clonedCircle, "Cloned object should not be the same instance as cached object");

        clonedCircle.draw();
        assertEquals("Drawing a Circle with radius 10 and ID 1\n", outContent.toString());
        outContent.reset();

        // Modify the cloned circle and ensure original in cache is unaffected
        ((Circle) clonedCircle).setRadius(20);
        clonedCircle.draw();
        assertEquals("Drawing a Circle with radius 20 and ID 1\n", outContent.toString());
        outContent.reset();

        Shape originalCircle = ShapeCache.shapeMap.get("1");
        assertEquals(10, ((Circle) originalCircle).getRadius(), "Original circle in cache should be unchanged");
    }

    @Test
    void testGetClonedRectangle() {
        Shape clonedRectangle = ShapeCache.getShape("2"); // ID for Rectangle
        assertNotNull(clonedRectangle);
        assertEquals("Rectangle", clonedRectangle.getType());
        assertEquals("2", clonedRectangle.getId());
        assertNotSame(ShapeCache.shapeMap.get("2"), clonedRectangle, "Cloned object should not be the same instance as cached object");

        clonedRectangle.draw();
        assertEquals("Drawing a Rectangle with width 5, height 7 and ID 2\n", outContent.toString());
        outContent.reset();

        // Modify the cloned rectangle and ensure original in cache is unaffected
        ((Rectangle) clonedRectangle).setWidth(10);
        ((Rectangle) clonedRectangle).setHeight(15);
        clonedRectangle.draw();
        assertEquals("Drawing a Rectangle with width 10, height 15 and ID 2\n", outContent.toString());
        outContent.reset();

        Shape originalRectangle = ShapeCache.shapeMap.get("2");
        assertEquals(5, ((Rectangle) originalRectangle).getWidth(), "Original rectangle in cache should be unchanged");
        assertEquals(7, ((Rectangle) originalRectangle).getHeight(), "Original rectangle in cache should be unchanged");
    }
}
