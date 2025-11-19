package br.com.danilors.interpreter;

/**
 * The Interpreter pattern given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
 */
public class AndExpression implements Expression {
    private Expression expr1;
    private Expression expr2;

    /**
     * Constructs a new AndExpression with the given expressions.
     *
     * @param expr1 the first expression
     * @param expr2 the second expression
     */
    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    /**
     * Interprets the context.
     *
     * @param context the context to interpret
     * @return true if both expressions interpret the context as true, false otherwise
     */
    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}