package br.com.danilors.state;

/**
 * The State interface. It declares methods that should be implemented by all concrete states.
 */
public  interface Tool {
     /**
      * This method is called when the mouse button is pressed.
      */
     void mouseDown();
     /**
      * This method is called when the mouse button is released.
      */
     void mouseUp();
}
