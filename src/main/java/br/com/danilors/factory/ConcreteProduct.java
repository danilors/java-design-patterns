package br.com.danilors.factory;

public class ConcreteProduct implements Product {
    @Override
    public void doSomething() {
        System.out.println("Doing something...");
    }
}