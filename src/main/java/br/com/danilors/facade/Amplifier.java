package br.com.danilors.facade;

/**
 * The Amplifier class is a part of the home theater subsystem.
 * It handles audio amplification.
 */
public class Amplifier {
    private Tuner tuner;
    private DvdPlayer dvd;

    public void on() {
        System.out.println("Amplifier On");
    }

    public void off() {
        System.out.println("Amplifier Off");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Amplifier setting DVD player to " + dvd.getClass().getSimpleName());
        this.dvd = dvd;
    }

    public void setTuner(Tuner tuner) {
        System.out.println("Amplifier setting Tuner to " + tuner.getClass().getSimpleName());
        this.tuner = tuner;
    }

    public void setVolume(int volume) {
        System.out.println("Amplifier setting volume to " + volume);
    }
}
