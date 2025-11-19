package br.com.danilors.templatemethod;

import org.junit.jupiter.api.Test;

public class TemplateMethodTest {

    @Test
    void testTemplateMethod() {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }
}