package br.com.danilors.singleton;

/**
 * The Singleton pattern ensures that a class has only one instance and provides a global point of access to it.
 */
public class Singleton {

    private static Singleton instance;

    /**
     * Private constructor to prevent instantiation from other classes.
     */
    private Singleton() {
    }

    /**
     * Returns the singleton instance of the class.
     *
     * @return the singleton instance
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}