package br.com.danilors.adapter;

import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    void testAdapter() {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}