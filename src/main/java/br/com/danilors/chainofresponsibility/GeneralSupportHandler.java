package br.com.danilors.chainofresponsibility;

/**
 * GeneralSupportHandler is a 'ConcreteHandler' that handles general support tickets.
 */
public class GeneralSupportHandler extends SupportTicketHandler {
    @Override
    public void handleRequest(String ticketType) {
        if (ticketType.equalsIgnoreCase("general")) {
            System.out.println("General Support handled the ticket: " + ticketType);
        } else if (successor != null) {
            successor.handleRequest(ticketType);
        } else {
            System.out.println("No handler found for ticket type: " + ticketType);
        }
    }
}
