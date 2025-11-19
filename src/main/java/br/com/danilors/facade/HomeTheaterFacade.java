package br.com.danilors.facade;

/**
 * The HomeTheaterFacade provides a simplified interface to the complex home theater system.
 * This is the 'Facade' in the Facade pattern.
 */
public class HomeTheaterFacade {
    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvd;

    /**
     * Constructs a HomeTheaterFacade with the given subsystem components.
     * @param amp the amplifier
     * @param tuner the tuner
     * @param dvd the DVD player
     */
    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
    }

    /**
     * Sets up the home theater for watching a movie.
     * @param movie the movie to play
     */
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        amp.on();
        amp.setDvd(dvd);
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    /**
     * Ends the movie watching experience.
     */
    public void endMovie() {
        System.out.println("Shutting down home theater...");
        dvd.stop();
        dvd.eject();
        dvd.off();
        amp.off();
    }

    /**
     * Sets up the home theater for listening to radio.
     */
    public void listenToRadio() {
        System.out.println("Get ready to listen to the radio...");
        amp.on();
amp.setTuner(tuner);
        tuner.on();
        tuner.setFm();
        tuner.setFrequency(103.3);
        amp.setVolume(3);
    }

    /**
     * Ends the radio listening experience.
     */
    public void endRadio() {
        System.out.println("Shutting down radio...");
        tuner.off();
        amp.off();
    }
}
