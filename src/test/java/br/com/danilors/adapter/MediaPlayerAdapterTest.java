package br.com.danilors.adapter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MediaPlayerAdapterTest {

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
    void testPlayMp3() {
        MediaPlayer audioPlayer = new Mp3Player();
        audioPlayer.play("mp3", "beyond_the_horizon.mp3");
        assertEquals("Playing mp3 file. Name: beyond_the_horizon.mp3\n", outContent.toString());
    }

    @Test
    void testPlayMp4() {
        MediaPlayer audioPlayer = new Mp3Player(); // Initial player
        audioPlayer = new MediaAdapter("mp4"); // Adapt for mp4
        audioPlayer.play("mp4", "alone.mp4");
        assertEquals("Playing mp4 file. Name: alone.mp4\n", outContent.toString());
    }

    @Test
    void testPlayVlc() {
        MediaPlayer audioPlayer = new Mp3Player(); // Initial player
        audioPlayer = new MediaAdapter("vlc"); // Adapt for vlc
        audioPlayer.play("vlc", "far_far_away.vlc");
        assertEquals("Playing vlc file. Name: far_far_away.vlc\n", outContent.toString());
    }

    @Test
    void testPlayUnsupportedFormat() {
        MediaPlayer audioPlayer = new Mp3Player();
        audioPlayer.play("avi", "mind_me.avi");
        assertEquals("Invalid media. avi format not supported by Mp3Player.\n", outContent.toString());
    }

    @Test
    void testPlayMp3WithAdapter() {
        // Even if we use the adapter, if the type is mp3, the Mp3Player should handle it
        MediaPlayer audioPlayer = new MediaAdapter("mp3"); // This adapter won't actually be used for mp3
        audioPlayer.play("mp3", "test.mp3");
        // The MediaAdapter constructor only creates AdvancedMediaPlayer for mp4/vlc.
        // For mp3, it would effectively do nothing, and the play method would also do nothing.
        // This test case highlights a potential flaw in the current MediaAdapter's design if it's
        // expected to handle mp3s via delegation.
        // For now, based on the current MediaAdapter implementation, it won't print anything for mp3.
        assertEquals("", outContent.toString());
    }
}
