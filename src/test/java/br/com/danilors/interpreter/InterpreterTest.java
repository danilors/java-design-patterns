package br.com.danilors.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InterpreterTest {

    @Test
    void testInterpreter() {
        Expression expression1 = new TerminalExpression("Hello");
        Expression expression2 = new TerminalExpression("World");
        Expression expression3 = new OrExpression(expression1, expression2);
        Expression expression4 = new AndExpression(expression1, expression2);

        assertTrue(expression3.interpret("Hello"));
        assertTrue(expression3.interpret("World"));
        assertFalse(expression3.interpret("Hi"));

        assertTrue(expression4.interpret("Hello World"));
        assertFalse(expression4.interpret("Hello"));
    }
}