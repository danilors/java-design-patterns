package br.com.danilors.decorator;

/**
 * The Decorator pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
 */
public abstract class Decorator implements Component {
    protected Component component;

    /**
     * Constructs a new decorator with the given component.
     *
     * @param component the component to decorate
     */
    public Decorator(Component component) {
        this.component = component;
    }

    /**
     * Performs the operation of the decorated component.
     */
    @Override
    public void operation() {
        component.operation();
    }
}