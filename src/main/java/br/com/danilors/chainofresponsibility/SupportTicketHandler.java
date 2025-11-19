package br.com.danilors.chainofresponsibility;

/**
 * The SupportTicketHandler is the 'Handler' in the Chain of Responsibility pattern.
 * It defines an interface for handling requests and optionally implements the successor link.
 */
public abstract class SupportTicketHandler {
    protected SupportTicketHandler successor;

    /**
     * Sets the next handler in the chain.
     * @param successor the next handler
     */
    public void setSuccessor(SupportTicketHandler successor) {
        this.successor = successor;
    }

    /**
     * Handles the support ticket or passes it to the next handler in the chain.
     * @param ticketType the type of the support ticket (e.g., "technical", "billing", "general")
     */
    public abstract void handleRequest(String ticketType);
}
