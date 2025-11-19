package br.com.danilors.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {

    @Test
    void testBuilder() {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.construct(builder);
        Product product = builder.getResult();
        assertEquals("Product{part1='Part 1', part2='Part 2'}", product.toString());
    }
}