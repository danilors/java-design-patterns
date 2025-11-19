package br.com.danilors.proxy;

/**
 * The Proxy pattern provides a surrogate or placeholder for another object to control access to it.
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    /**
     * Makes a request. If the real subject does not exist, it is created.
     */
    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}