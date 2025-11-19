package br.com.danilors.facade;

/**
 * The DvdPlayer class is a part of the home theater subsystem.
 * It handles DVD playback.
 */
public class DvdPlayer {
    private String movie;

    public void on() {
        System.out.println("DVD Player On");
    }

    public void off() {
        System.out.println("DVD Player Off");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println("DVD Player playing \"" + movie + "\"");
    }

    public void stop() {
        System.out.println("DVD Player stopped \"" + movie + "\"");
    }

    public void eject() {
        System.out.println("DVD Player eject");
    }
}
