package br.com.danilors.chainofresponsibility;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SupportTicketChainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testTechnicalTicket() {
        SupportTicketHandler technical = new TechnicalSupportHandler();
        SupportTicketHandler billing = new BillingSupportHandler();
        SupportTicketHandler general = new GeneralSupportHandler();

        technical.setSuccessor(billing);
        billing.setSuccessor(general);

        technical.handleRequest("technical");
        assertEquals("Technical Support handled the ticket: technical\n", outContent.toString());
    }

    @Test
    void testBillingTicket() {
        SupportTicketHandler technical = new TechnicalSupportHandler();
        SupportTicketHandler billing = new BillingSupportHandler();
        SupportTicketHandler general = new GeneralSupportHandler();

        technical.setSuccessor(billing);
        billing.setSuccessor(general);

        technical.handleRequest("billing");
        assertEquals("Billing Support handled the ticket: billing\n", outContent.toString());
    }

    @Test
    void testGeneralTicket() {
        SupportTicketHandler technical = new TechnicalSupportHandler();
        SupportTicketHandler billing = new BillingSupportHandler();
        SupportTicketHandler general = new GeneralSupportHandler();

        technical.setSuccessor(billing);
        billing.setSuccessor(general);

        technical.handleRequest("general");
        assertEquals("General Support handled the ticket: general\n", outContent.toString());
    }

    @Test
    void testUnhandledTicket() {
        SupportTicketHandler technical = new TechnicalSupportHandler();
        SupportTicketHandler billing = new BillingSupportHandler();
        SupportTicketHandler general = new GeneralSupportHandler();

        technical.setSuccessor(billing);
        billing.setSuccessor(general);

        technical.handleRequest("unknown");
        assertEquals("No handler found for ticket type: unknown\n", outContent.toString());
    }
}
