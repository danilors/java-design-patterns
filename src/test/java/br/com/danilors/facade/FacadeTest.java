package br.com.danilors.facade;

import org.junit.jupiter.api.Test;

public class FacadeTest {

    @Test
    void testFacade() {
        Facade facade = new Facade();
        facade.operation();
    }
}