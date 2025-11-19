package br.com.danilors.templatemethod;

public class ConcreteClass extends AbstractClass {
    @Override
    protected void primitiveOperation1() {
        System.out.println("Primitive operation 1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("Primitive operation 2");
    }
}