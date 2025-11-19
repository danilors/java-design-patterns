package br.com.danilors.bridge;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoteControlTest {

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
    void testBasicRemoteControlWithTv() {
        TvDevice tv = new TvDevice();
        RemoteControl basicRemote = new RemoteControl(tv);

        basicRemote.togglePower(); // Turn on
        assertTrue(tv.isEnabled());
        basicRemote.volumeUp();
        basicRemote.channelUp();
        basicRemote.printStatus();

        String expectedOutput = "TV is ON\n" +
                                "TV volume set to 40\n" +
                                "TV channel set to 2\n" +
                                "------------------------------------\n" +
                                "| I'm TV set.\n" +
                                "| I'm enabled\n" +
                                "| Current volume is 40%\n" +
                                "| Current channel is 2\n" +
                                "------------------------------------\n\n";
        assertEquals(expectedOutput, outContent.toString());
        outContent.reset();

        basicRemote.togglePower(); // Turn off
        assertFalse(tv.isEnabled());
        assertEquals("TV is OFF\n", outContent.toString());
    }

    @Test
    void testAdvancedRemoteControlWithRadio() {
        RadioDevice radio = new RadioDevice();
        AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(radio);

        advancedRemote.togglePower(); // Turn on
        assertTrue(radio.isEnabled());
        advancedRemote.volumeUp();
        advancedRemote.channelUp(); // Change frequency
        advancedRemote.mute(); // Mute
        advancedRemote.printStatus();

        String expectedOutput = "Radio is ON\n" +
                                "Radio volume set to 30\n" +
                                "Radio frequency set to 2 MHz\n" +
                                "Remote: Mute\n" +
                                "Radio volume set to 0\n" +
                                "------------------------------------\n" +
                                "| I'm Radio.\n" +
                                "| I'm enabled\n" +
                                "| Current volume is 0%\n" +
                                "| Current frequency is 2 MHz\n" +
                                "------------------------------------\n\n";
        assertEquals(expectedOutput, outContent.toString());
        outContent.reset();

        advancedRemote.togglePower(); // Turn off
        assertFalse(radio.isEnabled());
        assertEquals("Radio is OFF\n", outContent.toString());
    }
}
