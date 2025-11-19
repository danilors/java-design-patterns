package br.com.danilors.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PrototypeTest {

    @Test
    void testPrototype() {
        Prototype prototype = new ConcretePrototype("field");
        Prototype clone = prototype.clone();
        assertEquals(prototype.toString(), clone.toString());
        assertNotEquals(prototype, clone);
    }
}