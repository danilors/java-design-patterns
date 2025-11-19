package br.com.danilors.chainofresponsibility;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("Handled by ConcreteHandler2");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}