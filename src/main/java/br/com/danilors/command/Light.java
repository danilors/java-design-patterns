package br.com.danilors.command;

/**
 * The Light class acts as the 'Receiver' in the Command pattern.
 * It knows how to perform the operations associated with carrying out a request.
 */
public class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    /**
     * Turns the light on.
     */
    public void on() {
        System.out.println(location + " light is ON");
    }

    /**
     * Turns the light off.
     */
    public void off() {
        System.out.println(location + " light is OFF");
    }
}
