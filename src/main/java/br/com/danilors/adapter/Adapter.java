package br.com.danilors.adapter;

/**
 * The Adapter pattern converts the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    /**
     * Constructs a new Adapter with the given adaptee.
     *
     * @param adaptee the adaptee to adapt
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * Makes a request by calling the adaptee's specific request.
     */
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}