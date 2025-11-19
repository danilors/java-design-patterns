package br.com.danilors.proxy;

import org.junit.jupiter.api.Test;

public class ProxyTest {

    @Test
    void testProxy() {
        Subject subject = new Proxy();
        subject.request();
    }
}