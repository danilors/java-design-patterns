package br.com.danilors.decorator;

import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    void testDecorator() {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator(component);
        component.operation();
    }
}