package br.com.danilors.state;

/**
 * The Context class. It has a field for storing the current state and delegates the execution of the
 * state-specific methods to the current state object.
 */
public class Canvas {

    private Tool tool;

    /**
     * This method is called when the mouse button is pressed.
     */
    public void mouseDown(){
        tool.mouseDown();
    }

    /**
     * This method is called when the mouse button is released.
     */
    public void mouseUp(){
        tool.mouseUp();
    }

    /**
     * Gets the current tool.
     * @return The current tool.
     */
    public Tool getTool() {
        return tool;
    }

    /**
     * Sets the current tool.
     * @param tool The tool to be set.
     */
    public void setTool(Tool tool) {
        this.tool = tool;
    }
}
