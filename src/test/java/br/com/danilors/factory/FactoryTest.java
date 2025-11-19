package br.com.danilors.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FactoryTest {

    @Test
    void testFactory() {
        Factory factory = new Factory();
        Product product = factory.createProduct();
        assertNotNull(product);
    }
}