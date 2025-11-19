package br.com.danilors.chainofresponsibility;

/**
 * The Chain of Responsibility pattern avoids coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. It chains the receiving objects and passes the request along the chain until an object handles it.
 */
public abstract class Handler {
    protected Handler successor;

    /**
     * Sets the successor handler.
     *
     * @param successor the successor handler
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * Handles the request or passes it to the successor.
     *
     * @param request the request to handle
     */
    public abstract void handleRequest(int request);
}