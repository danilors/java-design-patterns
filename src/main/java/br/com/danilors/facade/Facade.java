package br.com.danilors.facade;

/**
 * The Facade pattern provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
 */
public class Facade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;

    /**
     * Constructs a new Facade.
     */
    public Facade() {
        this.subsystem1 = new Subsystem1();
        this.subsystem2 = new Subsystem2();
    }

    /**
     * Performs an operation using the subsystems.
     */
    public void operation() {
        subsystem1.operation1();
        subsystem2.operation2();
    }
}