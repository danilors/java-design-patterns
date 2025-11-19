package br.com.danilors.interpreter;

/**
 * AndFilterExpression is a 'NonterminalExpression' that performs a logical AND operation
 * on two other expressions.
 */
public class AndFilterExpression implements Expression {
    private Expression expr1;
    private Expression expr2;

    /**
     * Constructs an AndFilterExpression with two expressions.
     * @param expr1 the first expression
     * @param expr2 the second expression
     */
    public AndFilterExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    /**
     * Interprets the expression by performing a logical AND on the results of its sub-expressions.
     * @param context the context containing product attributes
     * @return true if both sub-expressions match the context, false otherwise
     */
    @Override
    public boolean interpret(ProductContext context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
