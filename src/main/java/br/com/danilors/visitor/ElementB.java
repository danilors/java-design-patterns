package br.com.danilors.visitor;

public class ElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "Element B";
    }
}