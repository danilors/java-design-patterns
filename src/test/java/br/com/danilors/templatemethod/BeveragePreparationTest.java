package br.com.danilors.templatemethod;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class BeveragePreparationTest {

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
    void testCoffeePreparation() {
        BeveragePreparation coffee = new CoffeePreparation();
        coffee.prepareBeverage();
        String expectedOutput = "Boiling water\n" +
                                "Dripping coffee through filter\n" +
                                "Pouring into cup\n" +
                                "Adding sugar and milk\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testTeaPreparation() {
        BeveragePreparation tea = new TeaPreparation();
        tea.prepareBeverage();
        String expectedOutput = "Boiling water\n" +
                                "Steeping the tea bag\n" +
                                "Pouring into cup\n" +
                                "Adding lemon\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
