package br.com.danilors.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * ProductContext holds the attributes of a product that the expressions will evaluate.
 * This acts as the 'Context' in the Interpreter pattern.
 */
public class ProductContext {
    private Map<String, String> attributes = new HashMap<>();

    /**
     * Adds an attribute to the product context.
     * @param key the attribute name (e.g., "color", "size", "priceCategory")
     * @param value the attribute value
     */
    public void addAttribute(String key, String value) {
        attributes.put(key.toLowerCase(), value.toLowerCase());
    }

    /**
     * Checks if the product context contains a specific attribute value.
     * @param key the attribute name
     * @param value the attribute value to check
     * @return true if the attribute exists and matches the value, false otherwise
     */
    public boolean hasAttribute(String key, String value) {
        return attributes.containsKey(key.toLowerCase()) && attributes.get(key.toLowerCase()).equals(value.toLowerCase());
    }

    /**
     * Gets the value of a specific attribute.
     * @param key the attribute name
     * @return the attribute value, or null if not found
     */
    public String getAttribute(String key) {
        return attributes.get(key.toLowerCase());
    }
}
