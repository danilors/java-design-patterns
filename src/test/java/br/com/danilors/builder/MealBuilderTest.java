package br.com.danilors.builder;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MealBuilderTest {

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
    void testVegMealBuilder() {
        MealDirector director = new MealDirector();
        VegMealBuilder vegMealBuilder = new VegMealBuilder();

        director.constructMeal(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();

        assertNotNull(vegMeal);
        assertTrue(vegMeal.toString().contains("Vegetable Curry"));
        assertTrue(vegMeal.toString().contains("Rice"));
        assertTrue(vegMeal.toString().contains("Water"));

        vegMeal.showItems();
        String expectedOutput = "Meal Items:\n" +
                                "- Vegetable Curry\n" +
                                "- Rice\n" +
                                "- Water\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testNonVegMealBuilder() {
        MealDirector director = new MealDirector();
        NonVegMealBuilder nonVegMealBuilder = new NonVegMealBuilder();

        director.constructMeal(nonVegMealBuilder);
        Meal nonVegMeal = nonVegMealBuilder.getMeal();

        assertNotNull(nonVegMeal);
        assertTrue(nonVegMeal.toString().contains("Chicken Biryani"));
        assertTrue(nonVegMeal.toString().contains("Naan Bread"));
        assertTrue(nonVegMeal.toString().contains("Coke"));

        nonVegMeal.showItems();
        String expectedOutput = "Meal Items:\n" +
                                "- Chicken Biryani\n" +
                                "- Naan Bread\n" +
                                "- Coke\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
