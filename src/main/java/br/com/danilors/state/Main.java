package br.com.danilors.state;

/**
 * The State pattern is a behavioral design pattern that allows an object to alter its behavior when its internal
 * state changes. The object appears to change its class.
 *
 * The pattern has three main components:
 * <ul>
 *     <li>{@link Canvas}: The Context class. It has a field for storing the current state and delegates the execution of the
 * state-specific methods to the current state object.</li>
 *     <li>{@link Tool}: The State interface. It declares methods that should be implemented by all concrete states.</li>
 *     <li>{@link BrushTool}, {@link SelectionTool}, {@link EraseTool}: Concrete states. These classes implement the methods of the {@link Tool} interface.</li>
 * </ul>
 */
public class Main {

    /**
     * The main method.
     * @param args The arguments.
     */
    public static void main(String[] args) {
        var canvas = new Canvas();

        canvas.setTool(new EraseTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
