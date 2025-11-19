package br.com.danilors.visitor;

public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "Element A";
    }
}