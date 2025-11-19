package br.com.danilors.interpreter;

/**
 * The Expression interface is the 'AbstractExpression' in the Interpreter pattern.
 * It declares an abstract interpret operation that is common to all nodes in the abstract syntax tree.
 */
public interface Expression {
    /**
     * Interprets the expression within the given context.
     * @param context the context containing product attributes
     * @return true if the expression matches the context, false otherwise
     */
    boolean interpret(ProductContext context);
}
