package br.com.danilors.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * The Composite pattern composes objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
 */
public class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    /**
     * Adds a component to the composite.
     *
     * @param component the component to add
     */
    public void add(Component component) {
        children.add(component);
    }

    /**
     * Removes a component from the composite.
     *
     * @param component the component to remove
     */
    public void remove(Component component) {
        children.remove(component);
    }

    /**
     * Performs the operation on all children.
     */
    @Override
    public void operation() {
        for (Component component : children) {
            component.operation();
        }
    }
}