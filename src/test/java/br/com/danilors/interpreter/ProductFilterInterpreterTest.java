package br.com.danilors.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductFilterInterpreterTest {

    @Test
    void testSingleAttributeFilter() {
        ProductContext product1 = new ProductContext();
        product1.addAttribute("color", "red");
        product1.addAttribute("size", "large");

        ProductContext product2 = new ProductContext();
        product2.addAttribute("color", "blue");
        product2.addAttribute("size", "medium");

        Expression redFilter = new ProductAttributeExpression("color", "red");
        Expression largeFilter = new ProductAttributeExpression("size", "large");

        assertTrue(redFilter.interpret(product1), "Product 1 should be red");
        assertFalse(redFilter.interpret(product2), "Product 2 should not be red");

        assertTrue(largeFilter.interpret(product1), "Product 1 should be large");
        assertFalse(largeFilter.interpret(product2), "Product 2 should not be large");
    }

    @Test
    void testAndFilter() {
        ProductContext product1 = new ProductContext();
        product1.addAttribute("color", "red");
        product1.addAttribute("size", "large");

        ProductContext product2 = new ProductContext();
        product2.addAttribute("color", "red");
        product2.addAttribute("size", "medium");

        ProductContext product3 = new ProductContext();
        product3.addAttribute("color", "blue");
        product3.addAttribute("size", "large");

        Expression redFilter = new ProductAttributeExpression("color", "red");
        Expression largeFilter = new ProductAttributeExpression("size", "large");
        Expression redAndLargeFilter = new AndFilterExpression(redFilter, largeFilter);

        assertTrue(redAndLargeFilter.interpret(product1), "Product 1 should be red AND large");
        assertFalse(redAndLargeFilter.interpret(product2), "Product 2 should be red but not large");
        assertFalse(redAndLargeFilter.interpret(product3), "Product 3 should be large but not red");
    }

    @Test
    void testOrFilter() {
        ProductContext product1 = new ProductContext();
        product1.addAttribute("color", "red");
        product1.addAttribute("size", "small");

        ProductContext product2 = new ProductContext();
        product2.addAttribute("color", "blue");
        product2.addAttribute("size", "large");

        ProductContext product3 = new ProductContext();
        product3.addAttribute("color", "green");
        product3.addAttribute("size", "medium");

        Expression redFilter = new ProductAttributeExpression("color", "red");
        Expression largeFilter = new ProductAttributeExpression("size", "large");
        Expression redOrLargeFilter = new OrFilterExpression(redFilter, largeFilter);

        assertTrue(redOrLargeFilter.interpret(product1), "Product 1 should be red OR large (is red)");
        assertTrue(redOrLargeFilter.interpret(product2), "Product 2 should be red OR large (is large)");
        assertFalse(redOrLargeFilter.interpret(product3), "Product 3 should not be red OR large");
    }

    @Test
    void testComplexFilter() {
        ProductContext product1 = new ProductContext();
        product1.addAttribute("color", "red");
        product1.addAttribute("size", "large");
        product1.addAttribute("category", "electronics");

        ProductContext product2 = new ProductContext();
        product2.addAttribute("color", "blue");
        product2.addAttribute("size", "medium");
        product2.addAttribute("category", "clothing");

        Expression redFilter = new ProductAttributeExpression("color", "red");
        Expression largeFilter = new ProductAttributeExpression("size", "large");
        Expression electronicsFilter = new ProductAttributeExpression("category", "electronics");

        // (red AND large) OR electronics
        Expression complexFilter = new OrFilterExpression(
                new AndFilterExpression(redFilter, largeFilter),
                electronicsFilter
        );

        assertTrue(complexFilter.interpret(product1), "Product 1 (red, large, electronics) should match");
        assertFalse(complexFilter.interpret(product2), "Product 2 (blue, medium, clothing) should not match");

        ProductContext product3 = new ProductContext();
        product3.addAttribute("color", "green");
        product3.addAttribute("size", "small");
        product3.addAttribute("category", "electronics");
        assertTrue(complexFilter.interpret(product3), "Product 3 (green, small, electronics) should match due to electronics");
    }
}
