package br.com.danilors.facade;

/**
 * The Tuner class is a part of the home theater subsystem.
 * It handles radio tuning.
 */
public class Tuner {
    public void on() {
        System.out.println("Tuner On");
    }

    public void off() {
        System.out.println("Tuner Off");
    }

    public void setAm() {
        System.out.println("Tuner set to AM");
    }

    public void setFm() {
        System.out.println("Tuner set to FM");
    }

    public void setFrequency(double frequency) {
        System.out.println("Tuner frequency set to " + frequency);
    }
}
