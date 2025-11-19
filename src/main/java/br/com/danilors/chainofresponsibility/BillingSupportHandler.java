package br.com.danilors.chainofresponsibility;

/**
 * BillingSupportHandler is another 'ConcreteHandler' that handles billing-related support tickets.
 */
public class BillingSupportHandler extends SupportTicketHandler {
    @Override
    public void handleRequest(String ticketType) {
        if (ticketType.equalsIgnoreCase("billing")) {
            System.out.println("Billing Support handled the ticket: " + ticketType);
        } else if (successor != null) {
            successor.handleRequest(ticketType);
        } else {
            System.out.println("No handler found for ticket type: " + ticketType);
        }
    }
}
