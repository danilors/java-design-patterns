package br.com.danilors.visitor;

import org.junit.jupiter.api.Test;

public class VisitorTest {

    @Test
    void testVisitor() {
        Element[] elements = {new ElementA(), new ElementB()};
        Visitor visitor = new ConcreteVisitor();
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}