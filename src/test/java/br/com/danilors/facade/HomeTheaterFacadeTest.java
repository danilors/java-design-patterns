package br.com.danilors.facade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeTheaterFacadeTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testWatchMovie() {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd);
        homeTheater.watchMovie("Raiders of the Lost Ark");

        String expectedOutput = "Get ready to watch a movie...\n" +
                                "Amplifier On\n" +
                                "Amplifier setting DVD player to DvdPlayer\n" +
                                "Amplifier setting volume to 5\n" +
                                "DVD Player On\n" +
                                "DVD Player playing \"Raiders of the Lost Ark\"\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testEndMovie() {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd);
        homeTheater.watchMovie("Raiders of the Lost Ark"); // Setup for ending
        outContent.reset(); // Clear output from setup

        homeTheater.endMovie();

        String expectedOutput = "Shutting down home theater...\n" +
                                "DVD Player stopped \"Raiders of the Lost Ark\"\n" +
                                "DVD Player eject\n" +
                                "DVD Player Off\n" +
                                "Amplifier Off\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testListenToRadio() {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd);
        homeTheater.listenToRadio();

        String expectedOutput = "Get ready to listen to the radio...\n" +
                                "Amplifier On\n" +
                                "Amplifier setting Tuner to Tuner\n" +
                                "Tuner On\n" +
                                "Tuner set to FM\n" +
                                "Tuner frequency set to 103.3\n" +
                                "Amplifier setting volume to 3\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testEndRadio() {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd);
        homeTheater.listenToRadio(); // Setup for ending
        outContent.reset(); // Clear output from setup

        homeTheater.endRadio();

        String expectedOutput = "Shutting down radio...\n" +
                                "Tuner Off\n" +
                                "Amplifier Off\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
