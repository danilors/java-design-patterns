package br.com.danilors.visitor;

/**
 * The Visitor pattern represents an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.
 */
public class ConcreteVisitor implements Visitor {
    /**
     * Visits ElementA.
     *
     * @param elementA the element A
     */
    @Override
    public void visit(ElementA elementA) {
        System.out.println(elementA.operationA());
    }

    /**
     * Visits ElementB.
     *
     * @param elementB the element B
     */
    @Override
    public void visit(ElementB elementB) {
        System.out.println(elementB.operationB());
    }
}