package br.com.danilors.state;

/**
 * A concrete state. This class implements the methods of the {@link Tool} interface.
 */
public class SelectionTool implements Tool {
    /**
     * This method is called when the mouse button is pressed.
     */
    @Override
    public void mouseDown() {
        System.out.println("Selection ICON");
    }

    /**
     * This method is called when the mouse button is released.
     */
    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed reactagle");
    }
}
