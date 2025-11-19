package br.com.danilors.chainofresponsibility;

/**
 * TechnicalSupportHandler is a 'ConcreteHandler' that handles technical support tickets.
 */
public class TechnicalSupportHandler extends SupportTicketHandler {
    @Override
    public void handleRequest(String ticketType) {
        if (ticketType.equalsIgnoreCase("technical")) {
            System.out.println("Technical Support handled the ticket: " + ticketType);
        } else if (successor != null) {
            successor.handleRequest(ticketType);
        } else {
            System.out.println("No handler found for ticket type: " + ticketType);
        }
    }
}
