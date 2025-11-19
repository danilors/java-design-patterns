package br.com.danilors.chainofresponsibility;

import org.junit.jupiter.api.Test;

public class ChainOfResponsibilityTest {

    @Test
    void testChainOfResponsibility() {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setSuccessor(handler2);
        handler1.handleRequest(5);
        handler1.handleRequest(15);
    }
}