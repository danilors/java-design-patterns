package br.com.danilors.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * The TreeFactory acts as the 'FlyweightFactory' in the Flyweight pattern.
 * It creates and manages TreeType objects, ensuring that common tree types are shared.
 */
public class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    /**
     * Returns a TreeType for the given name, color, and texture.
     * If a TreeType with these properties already exists, it is reused; otherwise, a new one is created.
     * @param name the name of the tree type (e.g., "Oak", "Pine")
     * @param color the color of the tree type
     * @param texture the texture of the tree type
     * @return a shared TreeType instance
     */
    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "_" + color + "_" + texture;
        if (!treeTypes.containsKey(key)) {
            // In a real scenario, you might have different concrete TreeType classes
            // For simplicity, we'll use a generic one or switch based on name
            if ("Oak".equalsIgnoreCase(name)) {
                treeTypes.put(key, new OakTreeType());
            } else if ("Pine".equalsIgnoreCase(name)) {
                treeTypes.put(key, new PineTreeType());
            } else {
                // Default or throw exception for unknown types
                System.out.println("Creating new generic tree type for: " + name);
                treeTypes.put(key, new TreeType() {
                    @Override
                    public void draw(int x, int y) {
                        System.out.println("Drawing generic " + name + " tree at (" + x + ", " + y + ") with color " + color + " and texture " + texture);
                    }
                });
            }
        }
        return treeTypes.get(key);
    }

    /**
     * Returns the number of unique tree types created.
     * @return the count of unique tree types
     */
    public static int getNumberOfTreeTypes() {
        return treeTypes.size();
    }
}
