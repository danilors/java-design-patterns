package br.com.danilors.chainofresponsibility;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("Handled by ConcreteHandler1");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}