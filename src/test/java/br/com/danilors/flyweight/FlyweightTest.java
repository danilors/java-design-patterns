package br.com.danilors.flyweight;

import org.junit.jupiter.api.Test;

public class FlyweightTest {

    @Test
    void testFlyweight() {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight(1);
        flyweight1.operation(10);
        Flyweight flyweight2 = factory.getFlyweight(1);
        flyweight2.operation(20);
    }
}