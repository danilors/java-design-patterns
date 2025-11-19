package br.com.danilors.prototype;

import java.util.Hashtable;

/**
 * ShapeCache acts as the 'Client' and 'Registry' for the Prototype pattern.
 * It stores and retrieves cloned Shape objects.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    /**
     * Loads initial shapes into the cache.
     */
    public static void loadCache() {
        Circle circle = new Circle(10);
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle(5, 7);
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
    }

    /**
     * Retrieves a cloned shape from the cache based on its ID.
     * @param shapeId the ID of the shape to retrieve
     * @return a cloned Shape object
     */
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
}
