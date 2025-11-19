package br.com.danilors.interpreter;

/**
 * ProductAttributeExpression is a 'TerminalExpression' that interprets a specific product attribute.
 * It checks if the ProductContext has a given attribute with a specific value.
 */
public class ProductAttributeExpression implements Expression {
    private String attributeKey;
    private String attributeValue;

    /**
     * Constructs a ProductAttributeExpression.
     * @param attributeKey the key of the product attribute (e.g., "color", "size")
     * @param attributeValue the value to match for that attribute (e.g., "red", "large")
     */
    public ProductAttributeExpression(String attributeKey, String attributeValue) {
        this.attributeKey = attributeKey;
        this.attributeValue = attributeValue;
    }

    /**
     * Interprets the expression by checking if the ProductContext contains the specified attribute and value.
     * @param context the context containing product attributes
     * @return true if the attribute matches, false otherwise
     */
    @Override
    public boolean interpret(ProductContext context) {
        return context.hasAttribute(attributeKey, attributeValue);
    }
}
