package br.com.danilors.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTest {

    @Test
    void testObserver() {
        Subject subject = new Subject();
        ConcreteObserver observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.setMessage("Hello World");
    }
}