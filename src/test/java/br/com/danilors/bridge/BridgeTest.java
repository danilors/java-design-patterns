package br.com.danilors.bridge;

import org.junit.jupiter.api.Test;

public class BridgeTest {

    @Test
    void testBridge() {
        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementationA());
        abstraction.operation();
        abstraction = new RefinedAbstraction(new ConcreteImplementationB());
        abstraction.operation();
    }
}