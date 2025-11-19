package br.com.danilors.composite;

import org.junit.jupiter.api.Test;

public class CompositeTest {

    @Test
    void testComposite() {
        Composite composite = new Composite();
        composite.add(new Leaf());
        composite.add(new Leaf());
        composite.operation();
    }
}