package br.com.danilors.state;

/**
 * A concrete state. This class implements the methods of the {@link Tool} interface.
 */
public class EraseTool implements Tool{
    /**
     * This method is called when the mouse button is pressed.
     */
    @Override
    public void mouseDown() {
        System.out.println("Erase icon");
    }

    /**
     * This method is called when the mouse button is released.
     */
    @Override
    public void mouseUp() {
        System.out.println("Erase Something");
    }
}
